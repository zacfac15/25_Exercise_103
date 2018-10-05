package beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.AbstractListModel;

public class AppointmentModell extends AbstractListModel implements Serializable
{

  private final String FILE_PATH = System.getProperty("user.dir")
          + File.separator + "src"
          + File.separator + "res"
          + File.separator + "termine.txt";

  public LinkedList<Appointment> list;

  public AppointmentModell()
  {
    list = new LinkedList<>();
  }

  @Override
  public int getSize()
  {
    return list.size();
  }

  @Override
  public Object getElementAt(int index)
  {
    return list.get(index);
  }

  public void addAppointment(Appointment app) throws Exception
  {

    if (!list.contains(app))
    {
      list.add(app);
      this.fireIntervalAdded(this, list.size() - 1, list.size() - 1);
    }
    else
    {
      throw new Exception("The list ...");
      //JOptionPane.showMessageDialog(null, "The list already contains the object!");
    }

  }

  public void deleteAppointment(int array[])
  {
    for (int i = 0; i < array.length; i++)
    {
      list.remove(array[i]);
    }
    this.fireIntervalRemoved(this, 0, list.size());

  }

  public void changeAppointment(Appointment app, int indexLast)
  {
    list.remove(indexLast);
    list.add(indexLast, app);
    this.fireContentsChanged(this, 0, list.size() - 1);
  }

  public Appointment get(int index)
  {
    return list.get(index);
  }

  public void save() throws IOException
  {
    FileOutputStream fos = new FileOutputStream(FILE_PATH);
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    for (Appointment appointment : list)
    {
      oos.writeObject(appointment);
    }

    oos.close();
  }

  public void load() throws IOException, ClassNotFoundException
  {

    FileInputStream fis = new FileInputStream(FILE_PATH);
    ObjectInputStream ois = new ObjectInputStream(fis);

    Object obj = ois.readObject();

    if (obj instanceof Appointment)
    {
      Appointment app = (Appointment) obj;
      list.add(app);
    }
    ois.close();
    this.fireContentsChanged(this, 0, list.size() - 1);
  }
}

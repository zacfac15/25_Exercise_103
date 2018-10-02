package beans;

import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;

public class AppointmentModel extends AbstractListModel
{
  public List<Appointment> list = new LinkedList<>();

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
}

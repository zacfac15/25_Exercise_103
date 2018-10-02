package beans;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Appointment
{
  public LocalDateTime datum;
  public String text;

  private transient DateTimeFormatter dtfDateTime = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm");

  public Appointment(LocalDateTime datum, String text)
  {
    this.datum = datum;
    this.text = text;
  }

  public LocalDateTime getDatum()
  {
    return datum;
  }

  public void setDatum(LocalDateTime datum)
  {
    this.datum = datum;
  }

  public String getText()
  {
    return text;
  }

  public void setText(String text)
  {
    this.text = text;
  }

  @Override
  public String toString()
  {
    return datum.format(dtfDateTime) + " - --> " + text;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
    {
      return true;
    }
    if (obj == null)
    {
      return false;
    }
    if (getClass() != obj.getClass())
    {
      return false;
    }
    final Appointment other = (Appointment) obj;
    if (!Objects.equals(this.text, other.text))
    {
      return false;
    }
    if (!Objects.equals(this.datum, other.datum))
    {
      return false;
    }
    return true;
  }

  public void writeObject(ObjectOutputStream oos) throws IOException
  {
    oos.defaultWriteObject();
    oos.writeUTF(dtfDateTime.toString());
  }
  
  private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
  {
    ois.defaultReadObject();
    String format = ois.readUTF();
    dtfDateTime = DateTimeFormatter.ofPattern(format); 
  }
}

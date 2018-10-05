package beans;

import GUI.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Appointment implements Serializable
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

  public String toSaveString()
  {
    datum.format(dtfDateTime);
    return datum.getDayOfMonth() + "-" + datum.getMonth().ordinal() + "-" + datum.getYear() + "-" + datum.getHour() + "-" + datum.getMinute() + "-" + text;

  }

  @Override
  public int hashCode()
  {
    int hash = 7;
    return hash;
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

//OBJ05-J. Do not return references to private mutable class members
//See Rule 05 - Object Orientation (OBJ)


class MutableClass {
  private Date d;
 
  public MutableClass() {
    d = new Date();
  }
 
  public Date getDate() {
    return d;
  }
}

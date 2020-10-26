//OBJ05-J. Do not return references to private mutable class members
//See Rule 05 - Object Orientation (OBJ)


public Date getDate() {
  return (Date)d.clone();
}

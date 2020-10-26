//ERR00-J. Do not suppress or ignore checked exceptions
//See Rule 07 - Exceptional Behavior (ERR)

try {
  //...
} catch (IOException ioe) {
  ioe.printStackTrace();
}

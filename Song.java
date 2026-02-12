/*
 * Activity 2.2.9
 */
public class Song
{
  private int rating;
  private String title;

  /*** Constructor ****/
  public Song(String title)
  {
    this.title = title;
    this.rating = 0;
  }
  
  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }
  
  public boolean equals(Song s)
  {
    if (s == null) return false;

    if (this.title.equals(s.title))
      return true; 
      
    return false;
  }

  public String toString() 
   {
     String info = "\"" + title + "\"";
     if (rating != 0) 
       info += ", rating is " + rating;
     
     return info;
   }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void adjustRating(int r)
  {
    if ((rating + r >= 0) && (rating + r <= 10))
      rating += r;
  }
}

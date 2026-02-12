/*
 * Activity 2.2.9
 */
public class Movie
{
  private int rating;
  private String title;
  private double duration;

  /*** Constructor ****/
  public Movie(String title, double duration)
  {
    this.title = title;
    this.duration = duration;
    this.rating = 0;
  }
  
  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }

  public int getRating() {
    return rating;
  }
  
  public boolean equals(Movie m)
  {
    if (m == null) return false;

    if (this.title.equals(m.title) && this.duration == m.duration)
      return true; 
      
    return false;
  }

  public String toString() 
   {
     String info = "\"" + title + "\", duration " + duration + " hours";
     if (rating != 0) 
       info += ", rating is " + rating;
     
     return info;
   }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }

  public void adjustRating(int r)
  {
    if ((rating + r >= 0) && (rating + r <= 10))
      rating += r;
  }
}

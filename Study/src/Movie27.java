public class Movie27 {
	String director, writer, star, name, genre;
	int level, minute, year, month, day;
	double rating;
	
	void print() {
		System.out.printf("'%s': Director is %s, Written by %s.\n", name, director, writer);
		System.out.printf("Stars are %s, Genre is %s.\n", star, genre);
		System.out.printf("Upper age %d can see this movie, length %d minutes.\n", level, minute);
		System.out.printf("Released on %04d, %02d, %02d.\n", year, month, day);
		System.out.printf("Rating: %.1f\n", rating);
	}
}

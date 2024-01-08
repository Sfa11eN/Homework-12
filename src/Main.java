
public class Main {
    public static void main(String[] args) {
        System.out.println("Обьекты и классы");

        Author fisher = new Author(" Сэм ", " Фишер  ");
        Author croft = new Author("Лара ", " Крофт");

        Book artOfStelthKills = new Book("Исскуство незаметных убийств", fisher, 2013);
        Book tombRider = new Book("Расхититель гробниц", croft, 2019);
        System.out.println(artOfStelthKills);
        System.out.println(tombRider);

        System.out.println(artOfStelthKills.getBookName() + " " + artOfStelthKills.getAuthor().getFirstName() + " " + artOfStelthKills.getAuthor().getSecondName() + " " + artOfStelthKills.getYearOfPublishing());

        artOfStelthKills.setYearOfPublishing(1997);

        System.out.println(artOfStelthKills.getBookName() + " " + artOfStelthKills.getAuthor().getFirstName() + " " + artOfStelthKills.getAuthor().getSecondName() + " " + artOfStelthKills.getYearOfPublishing());
    }
}
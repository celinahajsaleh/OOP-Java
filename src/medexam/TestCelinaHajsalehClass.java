package medexam;

public class TestCelinaHajsalehClass {
    public static void main(String[] args) {
        Department[] departments = {
                new Department("CS", "Dr. Shireen", 30),
                new Department("Emgineering", "Dr. Alaa", 23)
        };
        PTUK ptuk = new PTUK("Palestine Technical University - Kadoorie (PTUK)", "info@ptuk.edu.ps", PTUK.RAMALLAH, departments);
        System.out.println(ptuk);
    }
}


package Factory;

public class Factory {
    Worker work1 = new Accauntant();
    Worker work2 = new Manager();
    Worker work3 = new Loader();

    Worker[] works = {work1, work2, work3};
    public void printSalaries(){
        for(Worker work : works){

            System.out.println(work.getProfession());
            System.out.println(work.getSalary());

        }
    }
}

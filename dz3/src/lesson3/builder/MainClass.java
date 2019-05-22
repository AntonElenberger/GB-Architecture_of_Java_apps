package lesson3.builder;

public class MainClass {
    public static void main(String[] args) {
        final Workorder wo = new Workorder.Builder()
                .setAuthor("ELAN")
                .setWorkstep(1)
                .setPart("49-34-33A232")
                .setWorkstation("TJM")
                .setDueDate("10.MAR.2020")
                .build();
        StringBuilder sb = new StringBuilder();
        sb.append(wo.author).append(wo.part).append(wo.workstep).append(wo.dueDate).append(wo.workstation).toString();
        System.out.println(sb);
    }
}

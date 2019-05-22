package lesson3.builder;

public class Workorder {
    public final String author;
    public final String part;
    public final int workstep;
    public final String dueDate;
    public final String workstation;

    public Workorder(String author, String part, int workstep, String dueDate, String workstation) {
        this.author = author;
        this.part = part;
        this.workstep = workstep;
        this.dueDate = dueDate;
        this.workstation = workstation;
    }

    public static class Builder {
        private String author;
        private String part;
        private int workstep;
        private String dueDate;
        private String workstation;

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setPart(String part) {
            this.part = part;
            return this;
        }

        public Builder setWorkstep(int workstep) {
            this.workstep = workstep;
            return this;
        }

        public Builder setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder setWorkstation(String workstation) {
            this.workstation = workstation;
            return this;
        }

        public Workorder build() {
            return new Workorder(author, part, workstep, dueDate, workstation);
        }
    }
}

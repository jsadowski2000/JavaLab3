 enum EnumDepartment {
     inf("Wydzial Informatyki"),
     fiz("Wydzial Fizyki"),
     mat("Wydzial Matematyki");

     private String department;

     EnumDepartment(String wydzial) {
         this.department = wydzial;

     }
     public String getDepartment() {
         return department;
     }
 }



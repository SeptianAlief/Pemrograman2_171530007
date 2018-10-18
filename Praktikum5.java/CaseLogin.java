public class CaseLogin {
    public static void main(String[] args) throws IOEception{
        BufferedReader dataInput = new BufferedReader{
            new InputStreamReader(System.in));

        String id_user, password;
        boolean ststus = true;

        do{
            System.out.print("Masukkan ID. User : ");
            id_user = dataInput.readLine();

            System.out.print("Masukkan password : ");
            password = dataInput.readLine();

            if(!id_user.equals("171530024")){
                System.out.println("ID. User yang anda masukan salah!");
            }else{
                if(!id_user.equals("mahasiswa123")){
                    System.out.println("Password yang anda masukan salah!");
            }else{
                status = false;
            }
        }
        }while(status);
    }
}
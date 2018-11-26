public class JackOLanternRunner
{
    public static void main(String[] args)
    {
        String[][] face = new String[5][8];
        JackOLantern facel = new JackOLantern(face);

        facel.fill ("X");
        facel.edit(replace" ", row:0, column:0);
        facel.edit(replace" ", row:4, column:7);
        facel.edit(replace" ", row:0, column:7);
        facel.edit(replace" ", row:4, column:0);

        facel.edit(replace"0", row:0, column:0);
        facel.edit(replace"0", row:0, column:0);
        facel.edit(replace"^", row:0, column:0);
        facel.edit(replace"^", row:0, column:0);
        facel.edit(replace"|", row:0, column:0);
        facel.edit(replace"|", row:0, column:0);
        facel.edit(replace"-", row:0, column:0);
        facel.edit(replace"-", row:0, column:0);
        facel.edit(replace"|", row:0, column:0);
        facel.edit(replace"|", row:0, column:0);
        System.out.println(facel)
    }
}

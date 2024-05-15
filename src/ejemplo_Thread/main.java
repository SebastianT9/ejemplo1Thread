package ejemplo_Thread;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		proceso pc1=new proceso("Proceso1");
		proceso pc2=new proceso("Proceso2");
		proceso pc3=new proceso("Proceso3");
		pc1.start();
		pc2.start();
		pc3.start();
	}

}

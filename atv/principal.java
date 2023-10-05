package atv;

public class principal {
	public static void main(String[]args) {
		Veiculo veiculo = new Veiculo("Volks","Gol",2015,"Branco");
	System.out.println(veiculo.getMarca());
	System.out.println(veiculo.getModelo());
	System.out.println(veiculo.getAno());
	System.out.println(veiculo.getCor());
		
		Automovel automovel = new Automovel("Volks","Gol",2015,"Branco",2,"v8");
		
		System.out.println("\n"+automovel.getMarca());
		System.out.println(automovel.getModelo());
		System.out.println(automovel.getAno());
		System.out.println(automovel.getCor());
		System.out.println(automovel.getNumeroPortas());
		System.out.println(automovel.getMotor());
		
		Moto moto = new Moto("Volks","Gol",2015,"Branco",1000);
		System.out.println("\n"+moto.getMarca());
		System.out.println(moto.getModelo());
		System.out.println(moto.getAno());
		System.out.println(moto.getCor());
		System.out.println(moto.getCilindrada());;
		
		
		
	}

}
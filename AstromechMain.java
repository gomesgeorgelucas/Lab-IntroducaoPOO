
public class AstromechMain {

	public static void main(String[] args) {
		var mestre1 = new Mestre("Mestre 1", 100, "Afiliação", "Posto");
		var sensor1 = new Sensor("Azul", 100, 60);
		var conexao1 = new Conexao("LVDS", 1, 300000);
		
		var astroMech = new Astromech("Modelo 1", mestre1, sensor1, conexao1);
		
		System.out.println(astroMech.getDescricao());
		

	}

}

package pruebasrelaciones;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import balidea.pacetti.app.model.Detalle;
import balidea.pacetti.app.repository.DetallesRepository;

public class AppRepoDetalles {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		DetallesRepository repo = context.getBean("detallesRepository", DetallesRepository.class);
		
		List<Detalle> lista = repo.findAll();
		
		for(Detalle d : lista) {
			System.out.println(d);
		}
		
		context.close();

	}

}

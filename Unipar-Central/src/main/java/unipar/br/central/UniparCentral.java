package unipar.br.central;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import unipar.br.central.services.PaisService;
import unipar.br.central.models.Pais;
import unipar.br.central.repositores.EstadoDAO;
import unipar.br.central.models.Estado;


public class UniparCentral {

    public static void main(String[] args) {
        
        try {
            
            PaisService service = new PaisService();
            List<Pais> resultado = service.findAll();
            
            System.out.println(resultado.toString());
            
            Pais pais = new Pais();
            pais.setId(525257);
            pais.setNome("PAIS PROF BOSINGGGGGGPAIS");
            pais.setRegistroAcademico("17221");
            pais.setSigla("B8");
            
            service.insert(pais);
            service.update(pais);
            service.delete(525257);
            
            EstadoDAO estadoDAO = new EstadoDAO();
            List<Estado> listaEstados = estadoDAO.findAll();
            
            System.out.println(listaEstados.toString());
                       
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                    ex.getMessage());
        }
       
    }
}

package com.tienda_k.service;

import com.tienda_k.domain.Estado;
import java.util.List;

public interface EstadoService {
    
    // Se obtiene un listado de clientes en un List
    public List<Estado> getEstados();
    
    // Se obtiene un Cliente, a partir del id de un cliente
    public Estado getEstado(Estado estado);
    
    // Se inserta un nuevo cliente si el id del cliente esta vacío
    // Se actualiza un cliente si el id del cliente NO esta vacío
    public void save(Estado estado);
    
    // Se elimina el cliente que tiene el id pasado por parámetro
    public void delete(Estado estado);
    
}

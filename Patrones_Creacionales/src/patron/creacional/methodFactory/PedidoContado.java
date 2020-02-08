package patron.creacional.methodFactory;

public class PedidoContado extends Pedido{
	
	public PedidoContado(double importe){
		super(importe);
	}
	
	@Override
	public void paga(){
		System.out.println("El pago del pedido por importe de: " + importe + " se ha realizado.");
	}
	
	@Override
	public boolean valida(){
		return true;
	}
}

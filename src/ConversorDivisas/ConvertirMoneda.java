package ConversorDivisas;

	import javax.swing.JOptionPane;

	public class ConvertirMoneda {

		public void ConvertirPesosColombianosDolares(double valor) {
			double monedaDolar = valor / 4742.93;
			monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
		}
		public void ConvertirPesosColombianosEuros(double valor) {
			double monedaEuro = valor / 5028.33;
			monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
		}
		public void ConvertirPesosColombianosLibra(double valor) {
			double monedaLibra = valor / 5650.35;
			monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
		}
		public void ConvertirPesosColombianosYen(double valor) {
			double monedaYen = valor / 34.71;
			monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
		}
		public void ConvertirPesosColombianosWon(double valor) {
			double monedaWon = valor / 3.62;
			monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
		}


		public void ConvertirDolaresPesosColombianos(double valor) {
			double monedaDolar = 4742.93 * valor;
			monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
		}
		public void ConvertirEurosPesosColombianos(double valor) {
			double monedaEuro = valor * 5028.33;
			monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
		}
		public void ConvertirLibraPesosColombianos(double valor) {
			double monedaLibra = valor * 5650.35;
			monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
		}
		public void ConvertirYenPesosColombianos(double valor) {
			double monedaYen = valor * 34.71;
			monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
		}
		public void ConvertirWonPesosColombianos(double valor) {
			double monedaWon = valor * 3.62;
			monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
			JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en pesos");
		}
	
}

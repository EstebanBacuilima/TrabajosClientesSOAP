using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClienteSOAp
{
    class Program
    {
        static void Main(string[] args)
        {
            ServiciosWebSOAP.ServiciosClient cliente = new ServiciosWebSOAP.ServiciosClient();

            // Utilizar Metodos
            if (cliente.Login("0105957922David", "Esteban1234") )
            {
                Console.WriteLine("Bienvenido");
            }
            else
            {
                Console.WriteLine("Credenciales Incorrectas");
            }

		// Pago 

		if (cliente.ProcesarPago(500,100) >= 0 )
            {
                Console.WriteLine("Pago Realizado Existosamente");
            }
            else
            {
                Console.WriteLine("Saldo Insuficiente");
            }


            // cerra
            cliente.Close();
            Console.ReadKey();
        }
    }
}

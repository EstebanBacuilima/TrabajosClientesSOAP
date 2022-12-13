from zeep import Client

# Creamos nuestro cliente

cliente = Client('http://localhost:8083/ServiciosClienteServidorSOAP/Servicios?WSDL')

# LOGIN

if cliente.service.Login("0105957922David","Esteban1234"):
    print("Credenciales Correctas")
else:
    print("Revise sus credenciales")


# PAGO

if cliente.service.ProcesarPago(50,60) >= 0:
    print("Pago realizado")
    # print("Tu vuelto es: " + vuelto)
else:
    print("Saldo insuficiente")
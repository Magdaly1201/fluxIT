# fluxIT
Desafio Tecnico FluxIT

Api REST - Orientada al manejo de Candidados de FluxIT

url para levantar el proyecto mediante swagger ui

http://localhost:8080/swagger-ui.html#/

el api cuenta con tres RestController

	-Authentication Rest Controller : el unico metodo que tiene, funciona como login el cual valida el usuario y devuelve un token JWT para autenticarse en todos los futuros request 
	 
	- Candidate Rest Controller : cuenta con los metodos de create,buscar por id, delete, actualizar y una busqueda pagina con la posibilidad de filtrar por documento y nombre. para poder realizar peticiones a este restController el usuario tiene que contar con el rol: "ROLE_CONSULTING" y estar previamente autenticado
	
	- User RestController: cuenta con solo dos metodos para crear y listar todos los usuario , para poder realizar dichas consultas se tiene que tener el rol: ROLE_ADMIN
	
	
# USUARIOS  (/api/v1/users)

      "username": "MAGDALY"
      "fullName": "Magdaly Santos"
      "password": "1234"
      "role": "ROLE_ADMIN"
     
      "username": "NSANTOS"
      "fullName": "Nohemy Santos"
      "password": "1234"
      "role": "ROLE_CONSULTING"
      
NOTA : Para crear usuario hay que tomar en cuenta que en los ROLES: solo acepta "ROLE_ADMIN" y "ROLE_CONSULTING"
	


# TECNOLOGIAS 
	-java 1.8
	-Spring boot 
	-JPA
	-JSON Web Token + Interceptor + RolesAllowed 
	-Java Validation
	-RestTemplate
	-Swagger 
	
#POSIBLES MEJORAS

	-mas validaciones con expressiones regulares para evitar cualquier vulnerabilidad en cada DTO de 	entrada.
	-crear otro microservicio que sea de user y una SDK para manejo de todo lo que es autenticacion y 	autorizacion.
	-crear otras excepciones para posibles errores con la conexion de la bd.
	-Encriptar la password en la bd y no mostrarla a la hora de listar por temas de seguridad.
	-agregar metodos de get by id en el UserRestController y algunos otros necesarios.
	-colocar las properties de conexion con la bd en variables de entorno del equipo.
	-agregar mas logger en toda la api asi saber todo el recorrido del usuario.
	
	
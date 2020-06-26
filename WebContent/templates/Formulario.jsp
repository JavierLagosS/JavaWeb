<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <header class="container py-5">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center">Formulario de Accidente </h1>
                </div>
            </div>
        </div>
    </header>

 <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card shadow">
                            <div class="card-body">
                                <form method="post" action="templates/ProcesarFormulario.jsp" name="formulario" class="p-3">
                                    <h2 class="pb-4">Datos Accidentado</h2>
                                    <div class="form-group row ">
                                        <div class="col-md-4 " id="datosNombre">
                                            <label for="">Nombre</label>
                                            <input type="text" name="nombre" id="nombre" class="form-control" required>
                                        </div>
                                        <div class="col-md-4" id="datosApellido">
                                            <label for="">Apellido</label>
                                            <input type="text" name="apellido" id="apellido" class="form-control"  required>
                                        </div>
                                        <div class="col-md-4" id="datosFono">
   	        	                             <label for="">Telefono</label>
    		                                 <input type="text" name="telefono" id="telefono" class="form-control" >
                                      </div>
                                    </div>
                                    <div class="form-group row">
                                      <div class="col-md-6">
                                        <label for="">F. nac.</label>
                                        <input type="date" name="fechaN" id="fechaN" class="form-control" required>
                                      </div>
                                       <div class="col-md-6">
                                        <label for="">Fecha Acidente</label>
                                        <input type="date" name="fechaA" id="fechaA" class="form-control" required>
                                      </div>


                                    </div>
                                    
                                    <div class="form-group row">
                                      <div class="col-md-6">
                                        <label for="">Cargo</label>
                                        <select class="form-control" id="cargo" name="cargo">
                                            <option value="" disabled>seleccione una opcion</option>
                                            <option value="Jefe de Operaciones">Jefe de Operaciones</option>
                                            <option value="RRHH">Recursos Humanos</option>
                                           	<option value="Colaborador">Colaborador</option>
                                        </select><br><br>
                                      </div>
                                      <div class="col-md-6">
                                        <label for="">Sistema Previsional</label>
                                        <select class="form-control" id="previsional" name="previsional">
                                            <option value="" disabled>seleccione una opcion</option>
                                            <option value="Isapre">Isapre</option>
                                            <option value="Fonasa">Fonasa</option>
                                           	<option value="no Afiliado">No Afiliado</option>
                                        </select><br><br>
                                      </div>
                                     
                                        <div class="col-md-6">
                                            <label for="">direccion</label>
                                        <input type="text" name="direccion" id="direccion" class="form-control" required><br><br>
                                        </div>
                                        <div class="col-md-6">
                                            <label for="">ciudad</label>
                                        <input type="text" name="ciudad" id="ciudad" class="form-control" required><br><br>
                                        </div>
                                        <div class="form-check col-md-6 text-center col-sm-12">
 											 <input class="form-check-input" type="radio" name="sexo" id="exampleRadios1" value="Masculino" checked>
  											<label class="form-check-label" for="exampleRadios1">Masculino</label>
									  </div>
									  <div class="form-check col-md-6 text-center col-sm-12">
  											<input class="form-check-input" type="radio" name="sexo" id="exampleRadios2" value="femenino">
  											<label class="form-check-label" for="exampleRadios2">femenino</label>
									 </div><br/><br/>
									 <div class="col-md-12 text-center ">
                                        <label for="name">Descripcion del accidente</label><br />
                                        <textarea class="form-control" name="text" id="text"  rows="5"></textarea>
                                        </div>
                                         </div>
                                                                               
                                        
                                    
                                    <button class="btn btn-primary btn-lg" type="submit" >Enviar</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

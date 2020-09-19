
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner linea = new Scanner(System.in);
        Arbol ab = new Arbol();
        Lista area1 = new Lista();
        Lista area2 = new Lista();
        Lista area3 = new Lista();
        Lista area4 = new Lista();
        Lista area5 = new Lista();
        Lista area6 = new Lista();

        Libro li, libro;
        int id = 0, id_nodo, oparea;
        String nom, autor = null, nombre_area;

        System.out.println("--------------------------------------------------------- \n"
                + "---------------------------------------------------------\n"
                + "------------ BIENVENIDOS A LA BIBLIOTECA-----------\n"
                + "-- ------------------------------------------------------");
        System.out.println("");

        int op;
        boolean h = true;
        while (h) {
            System.out.println("--------------MENÚ DE OPCIONES-----------");
            System.out.println("1. Insertar Libro");
            System.out.println("2. Consultar Areas del Conocimiento ");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Consultar Libro ");
            System.out.println("5. Mostrar todo el arbol de areas del conocimiento y datos importantes");
            System.out.println("6. Salir");
            System.out.println("");

            op = linea.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    System.out.println("Desea insertar por: == 1.) INICIO 2.)FINAL");
                    oparea = linea.nextInt();
                    if (oparea == 1) {
                        try {
                            System.out.println("Digite el id del libro");
                            id = linea.nextInt();
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("no es un numero es una letra ingresalo de nuevo ");
                            linea = new Scanner(System.in);
                            id = linea.nextInt();
                        }
                        System.out.println("Digite el nombre del libro");
                        nom = linea.next();
                        System.out.println("Digite el nombre del autor");
                        autor = linea.next();
                        System.out.println("");
                        li = new Libro(id, nom, autor);
                        System.out.println("AH QUE AREA DEL CONOCIMIENTO PERTENECE? == 1.) ARTE 2.)CIENCIAS BASICAS 3.)INGENIERIA 4.)DEPORTE 5.)CIENCIAS AGRICOLAS, 6.) humanidades");
                        oparea = linea.nextInt();
                        System.out.println("");
                        if (oparea == 1) {
                            area1.insertarInicio(new NodoLista(li));
                            ab.Insertar(new NodoArbol(1, "ARTE", area1));
                        } else if (oparea == 2) {
                            area2.insertarInicio(new NodoLista(li));
                            ab.Insertar(new NodoArbol(2, "CIENCIAS BASICAS", area2));
                        } else if (oparea == 3) {
                            area3.insertarInicio(new NodoLista(li));
                            ab.Insertar(new NodoArbol(3, "INGENIERIA", area3));
                        } else if (oparea == 4) {
                            area4.insertarInicio(new NodoLista(li));
                            ab.Insertar(new NodoArbol(4, "DEPORTE", area4));
                        } else if (oparea == 5) {
                            area5.insertarInicio(new NodoLista(li));
                            ab.Insertar(new NodoArbol(5, "CIENCIAS AGRICOLAS", area5));
                        }
                        System.out.println("");
                    } else if (oparea == 2) {
                        try {
                            System.out.println("Digite el id del libro");
                            id = linea.nextInt();
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("no es un numero es una letra ingresalo de nuevo ");
                            linea = new Scanner(System.in);
                            id = linea.nextInt();
                        }
                        System.out.println("Digite el nombre del libro");
                        nom = linea.next();
                        System.out.println("Digite el nombre del autor");
                        autor = linea.next();
                        System.out.println("");
                        li = new Libro(id, nom, autor);
                        System.out.println("AH QUE AREA DEL CONOCIMIENTO PERTENECE? == 1.) ARTE 2.)CIENCIAS BASICAS 3.)INGENIERIA 4.)DEPORTE 5.)CIENCIAS AGRICOLAS");
                        oparea = linea.nextInt();
                        System.out.println("");
                        if (oparea == 1) {
                            area1.insertarFinal(new NodoLista(li));
                            ab.Insertar(new NodoArbol(1, "ARTE", area1));
                        } else if (oparea == 2) {
                            area2.insertarFinal(new NodoLista(li));
                            ab.Insertar(new NodoArbol(2, "CIENCIAS BASICAS", area2));
                        } else if (oparea == 3) {
                            area3.insertarFinal(new NodoLista(li));
                            ab.Insertar(new NodoArbol(3, "INGENIERIA", area3));
                        } else if (oparea == 4) {
                            area4.insertarFinal(new NodoLista(li));
                            ab.Insertar(new NodoArbol(4, "DEPORTE", area4));
                        } else if (oparea == 5) {
                            area5.insertarFinal(new NodoLista(li));
                            ab.Insertar(new NodoArbol(5, "CIENCIAS AGRICOLAS", area5));
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el id del area del conocimiento a buscar: 1.) ARTE 2.)CIENCIAS BASICAS 3.)INGENIERIA 4.)DEPORTE 5.)CIENCIAS AGRICOLAS");
                    id_nodo = linea.nextInt();
                    System.out.println("");
                    System.out.println(ab.BuscarNodo(id_nodo));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("De que area quieres eliminar el libro 1.) ARTE 2.)CIENCIAS BASICAS 3.)INGENIERIA 4.)DEPORTE 5.)CIENCIAS AGRICOLAS");
                    oparea = linea.nextInt();
                    if (oparea == 1) {
                        System.out.println("ingresa el id del libro");
                        id = linea.nextInt();
                        area1.eliminaValor(id);
                    } else if (oparea == 2) {
                        System.out.println("ingresa el id del libro");
                        id = linea.nextInt();
                        area2.eliminaValor(id);
                    } else if (oparea == 3) {
                        System.out.println("ingresa el id del libro");
                        id = linea.nextInt();
                        area3.eliminaValor(id);
                    } else if (oparea == 4) {
                        System.out.println("ingresa el id del libro");
                        id = linea.nextInt();
                        area4.eliminaValor(id);
                    } else if (oparea == 5) {
                        System.out.println("ingresa el id del libro");
                        id = linea.nextInt();
                        area5.eliminaValor(id);
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Ingresa el id del libro ");
                    id = linea.nextInt();
                    System.out.println(ab.Consultar_ju(ab.raiz, id));
                    break;

                case 5:
                    System.out.println("Has seleccionado mostrar arbol area del comocimiento");
                    System.out.println("PostOrden");
                    ab.PostOrden(ab.raiz);
                    System.out.println("");
                    System.out.println("-----------");
                    System.out.println("DATOS DEL ARBOL AREA DEL CONOCIMIENTO");
                    System.out.println("");
                    System.out.println("Raiz del arbol");
                    System.out.println(ab.Raiz());
                    System.out.println("");
                    ab.menorValor();
                    ab.mayorValor();
                    System.out.println("");
                    System.out.println("-Retornar altura del arbol " + ab.retornarAltura());
                    System.out.println("");
                    System.out.println("-Imprimindo Balance del arbol");
                    ab.imprimirBalance();
                    System.out.println("");
                    System.out.println("-Imprimiendo Nivel del arbol");
                    ab.imprimirNivel();
                    System.out.println("");
                    System.out.println("Cantidad Nodos del Arbol" + ab.cantidadNodos());
                    System.out.println("");
                    break;
                case 6:
                    h = false;
                    break;
                default:
                    System.out.println("Error no existe la opcion");
                    break;
            }
        }
    }
}

class Libro { 
    int id_libro;
    String nombre_libro;
    String autor;

    public Libro(){
        
    }
    
    public Libro(int id_libro, String nombre_libro, String autor) {
        this.id_libro = id_libro;
        this.nombre_libro = nombre_libro;
        this.autor = autor;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "[ ID Libro= " + id_libro + " - Nombre Libro= " + nombre_libro + " - Autor= " + autor + ']';  
    }   
}

class NodoLista {

    Libro info;
    NodoLista sig;
    NodoLista ant;
    
    NodoLista(Libro info){
        this.info=info;
        sig=ant=null;
    }

    public Libro getInfo() {
        return info;
    }

    public void setInfo(Libro info) {
        this.info = info;
    }  
}

class Lista {
     NodoLista cab;

    Lista() {
        cab = null;
    }

    boolean vacia() {
        return (cab == null);
    }

    void insertarInicio(NodoLista nuevo) {
        if (!vacia()) {
            nuevo.sig = cab;
        }
        cab = nuevo;
    }

    void insertarFinal(NodoLista nuevo) {
        if (vacia()) {
            cab = nuevo;
        } else {
            NodoLista aux = cab;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }

    }

    int contar() {
        return contar(cab);
    }
    
    int contar(NodoLista x) {
        return (x == null) ? 0 : contar(x.sig) + 1;
    }

    public Libro libro_es(int id) {
        Libro e = null;

        if (cab != null) {
            NodoLista tem = cab;
            while (tem != null) {
                if (tem.info.getId_libro() == id) {
                    e = tem.info;
                }
                tem = tem.sig;
            }
        }
        return e;
    }

    public void eliminaValor(int valor) {
        if (cab!= null) {
              System.out.println("entro");
            NodoLista aux = cab;
            NodoLista ant = null;
            while (aux != null) {
                if (aux.info.getId_libro() == valor) {
                    if (ant == null) {
                        cab = cab.sig;
                        aux.sig = null;
                        aux = cab;

                    } else {
                        ant.sig = aux.sig;
                        aux.sig = null;
                        aux = ant.sig;
                    }
                } else {
                    ant = aux;
                    aux = aux.sig;
                }
            }
        }
    }
    

    String mostrar() {

        return (vacia()) ? "Vacia" : mostrar(cab);

    }

    String mostrar(NodoLista tmp) {
        return (tmp != null) ? tmp.info + " == " + mostrar(tmp.sig) : "";
    }

    @Override
    public String toString() {
        return mostrar(cab);
    }
}

class NodoArbol {
 
    int dato;
    String nombre;
    Lista areaconocimiento;
    NodoArbol izquierda, derecha;

    public NodoArbol(int d, String nomb, Lista area) {
        dato = d;
        areaconocimiento = area;
        nombre=nomb;
        izquierda = derecha = null;
    }

    @Override
    public String toString() {
        return "AREA DEL CONOCIMIENTO= "+ nombre + "=" + " LIBRO= " + areaconocimiento;
    }   
}

class Arbol {
 
    NodoArbol raiz;
    int cant;
    int altura;
    Libro datos;

    public Arbol() {
        raiz = null;
    }

    public void Insertar(NodoArbol nuevo) {

        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (nuevo.dato < auxiliar.dato) {
                    auxiliar = auxiliar.izquierda;
                    if (auxiliar == null) {
                        padre.izquierda = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.derecha;
                    if (auxiliar == null) {
                        padre.derecha = nuevo;
                        return;
                    }
                }
            }
        }
    }
    

    public boolean Vacio() {
        return raiz == null;
    }

    public void InOrden(NodoArbol r) {
        if (r != null) {
            InOrden(r.izquierda);
            System.out.print(r.dato);
            InOrden(r.derecha);
        }
    }

    public void PreOrden(NodoArbol r) {
        if (r != null) {
            System.out.print(r.dato);
            PreOrden(r.izquierda);
            PreOrden(r.derecha);
        }
    }

    public void PostOrden(NodoArbol r) {
        if (r != null) {
            PostOrden(r.izquierda);
            PostOrden(r.derecha);
            System.out.println(r.areaconocimiento);
        }
    }

    public String BuscarNodo(int d) {
        NodoArbol aux = raiz;
        while (aux.dato != d) {
            if (d < aux.dato) {
                aux = aux.izquierda;
            } else {
                aux = aux.derecha;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux.toString();
    }

    public Libro Consultar_ju(NodoArbol r, int id) {
        if (r != null) {

            Consultar_ju(r.izquierda, id);
            if (r.areaconocimiento.libro_es(id) != null) {
                datos = r.areaconocimiento.libro_es(id);
            }
            Consultar_ju(r.derecha, id);
        }

        return datos;
    }

    public boolean existe(int info) {
        NodoArbol reco = raiz;
        while (reco != null) {
            if (info == reco.dato) {
                return true;
            } else if (info > reco.dato) {
                reco = reco.derecha;
            } else {
                reco = reco.izquierda;
            }
        }
        return false;
    }

    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    private void retornarAltura(NodoArbol reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.izquierda, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.derecha, nivel + 1);
        }
    }

    public void menorValor() {
        if (raiz != null) {
            NodoArbol reco = raiz;
            while (reco.izquierda != null) {
                reco = reco.izquierda;
            }
            System.out.println("-Menor valor del árbol:" + reco.dato);
        }
    }

    public void mayorValor() {
        if (raiz != null) {
            NodoArbol reco = raiz;
            while (reco.derecha != null) {
                reco = reco.derecha;
            }
            System.out.println("-Mayor valor del árbol:" + reco.dato);
        }
    }

    int subizq = 0;
    int subder = 0;

    public void imprimirBalance() {
        subizq = 0;
        subder = 0;

        Balance(this.raiz, true, 0);
        System.out.println("lado Izquierdo " + subizq + " Lado Derecho " + subder);
        if (subizq - subder == 0) {
            System.out.println("-El balance es: 0 ");
        } else if (subizq - subder == -1) {
            System.out.println("-El balance es -1, derecha");
        } else if (subizq - subder == 1) {
            System.out.println("-El balance 1, izquierda");

        } else {
            System.out.println("-No es balanceado.."
                    + "porque es mas grande el lado "
                    + ((subizq > subder) ? "Izquierdo" : "Derecho"));
        }

    }

    public void Balance(NodoArbol reco, boolean lado, int i) {

        if (reco != null) {

            if (reco.derecha == null && reco.izquierda == null) {
                if (lado) {
                    subder = (i > subder) ? i : subder;
                } else {
                    subizq = (i > subizq) ? i : subizq;
                }
            }

            Balance(reco.derecha, lado, i + 1);
            if (i == 0) {
                lado = false;
            }
            Balance(reco.izquierda, lado, i + 1);
        }

    }

    //altura arbol
    String[] niveles;

    public void imprimirNivel() {
        niveles = new String[altura + 1];

        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length; i++) {
            System.out.println(niveles[i] + " En nivel: " + i);
        }
    }

    private void imprimirNivel(NodoArbol pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.dato + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.derecha, nivel2 + 1);
            imprimirNivel(pivote.izquierda, nivel2 + 1);
        }
    }

    public boolean Eliminar(int d) {
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        boolean hijoizq = true;
        while (auxiliar.dato != d) {
            padre = auxiliar;
            if (d < auxiliar.dato) {
                hijoizq = true;
                auxiliar = auxiliar.izquierda;
            } else {
                hijoizq = false;
                auxiliar = auxiliar.derecha;
            }
            if (auxiliar == null) {
                return false;
            }
        }//si es hoja 
        if (auxiliar.izquierda == null && auxiliar.derecha == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (hijoizq) {
                padre.izquierda = null;
            } else {
                padre.derecha = null;
            }
        } else if (auxiliar.derecha == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.izquierda;
            } else if (hijoizq) {
                padre.izquierda = auxiliar.izquierda;
            } else {
                padre.derecha = auxiliar.izquierda;
            }
        } else if (auxiliar.izquierda == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.derecha;
            } else if (hijoizq) {
                padre.izquierda = auxiliar.derecha;
            } else {
                padre.derecha = auxiliar.derecha;
            }// es la raiz
        } else {
            NodoArbol reemplazo = ObtenerReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (hijoizq) {
                padre.izquierda = reemplazo;
            } else {
                padre.derecha = reemplazo;
            }
            reemplazo.izquierda = auxiliar.izquierda;
        }
        return true;
    }

    public NodoArbol ObtenerReemplazo(NodoArbol nodoreemplazo) {
        NodoArbol reemplazarpadre = nodoreemplazo;
        NodoArbol reemplazo = nodoreemplazo;
        NodoArbol auxiliar = nodoreemplazo.derecha;
        while (auxiliar != null) {
            reemplazarpadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.izquierda;
        }
        if (reemplazo != nodoreemplazo.derecha) {
            reemplazarpadre.izquierda = reemplazo.derecha;
            reemplazo.derecha = nodoreemplazo.derecha;
        }
        System.out.println("El Nodo Reemplazo es:" + reemplazo);
        return reemplazo;
    }

    public int cantidadNodos() {
        cant = 0;
        cantidad(raiz);
        return cant;
    }

    private void cantidad(NodoArbol reco) {
        if (reco != null) {
            cant++;
            cantidad(reco.izquierda);
            cantidad(reco.derecha);
        }
    }

    public NodoArbol Raiz() {
        return raiz;
    }
}
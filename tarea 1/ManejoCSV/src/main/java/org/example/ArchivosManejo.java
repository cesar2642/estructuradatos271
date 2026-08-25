package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivosManejo {
        private String ruta;

        public ArchivosManejo() {
        }

        public ArchivosManejo(String ruta) {
            this.ruta = ruta;
        }

        public String getRuta() {
            return ruta;
        }

        public void setRuta(String ruta) {
            this.ruta = ruta;
        }

        /*public void escribir(String texto){

            try (FileOutputStream salida = new FileOutputStream(this.ruta)) {
                salida.write(texto.getBytes());
                System.out.println("Fin de escritura");

            } catch ( FileNotFoundException e) {
                System.out.println("Archivo no encontrado.");
            } catch(IOException ioe ){
                System.out.println("Error al escribir");
            }
        }*/

        public void leer(int colInicio, int colFin){

            int twitterEnero = 0;
            int twitterJunio = 0;

            int ytInicio = 0;
            int ytFin = 0;

            double sumaCrecimientoFB = 0;
            double sumaCrecimientoTW = 0;

            double sumaLikesFB = 0;
            double sumaLikesTW = 0;
            double sumaLikesYT = 0;


            try (FileInputStream entrada = new FileInputStream(this.ruta)) {
                int byteLeido;
                String renglon = "";

                while ((byteLeido = entrada.read()) != -1) {
                    char caracter = (char) byteLeido;

                    if (caracter != '\n' && caracter != '\r'){
                        renglon += caracter;
                    }
                    else if (caracter == '\n') {

                        String[] columnas = renglon.split(",");

                        if (columnas[0].equalsIgnoreCase("TWITTER") && columnas[1].contains("SEGUIDORES") ){

                            twitterEnero = Integer.parseInt(columnas[3]);
                            twitterJunio = Integer.parseInt(columnas[9]);
                        }

                        if (columnas[0].equalsIgnoreCase("YOUTUBE") && columnas[1].contains("VISUALIZACIONES")) {

                            ytInicio = Integer.parseInt(columnas[colInicio]);
                            ytFin = Integer.parseInt(columnas[colFin]);

                        }

                        if (columnas[0].equalsIgnoreCase("FACEBOOK") && columnas[1].contains("CRECIMIENTO (seguidores)")) {

                            sumaCrecimientoFB = Integer.parseInt(columnas[3]) +
                                                Integer.parseInt(columnas[4]) +
                                                Integer.parseInt(columnas[5]) +
                                                Integer.parseInt(columnas[6]) +
                                                Integer.parseInt(columnas[7]) +
                                                Integer.parseInt(columnas[8]);
                        }

                        if (columnas[0].equalsIgnoreCase("TWITTER") && columnas[1].contains("CRECIMIENTO DE FOLLOWERS")) {

                            sumaCrecimientoTW = Integer.parseInt(columnas[3]) +
                                                Integer.parseInt(columnas[4]) +
                                                Integer.parseInt(columnas[5]) +
                                                Integer.parseInt(columnas[6]) +
                                                Integer.parseInt(columnas[7]) +
                                                Integer.parseInt(columnas[8]);
                        }

                        if (columnas[0].equalsIgnoreCase("FACEBOOK") && columnas[1].contains("ME GUSTA")) {
                            for (int i = 3; i <= 8; i++) {
                                sumaLikesFB += Integer.parseInt(columnas[i]);
                            }
                        }

                        if (columnas[0].equalsIgnoreCase("TWITTER") && columnas[1].contains("ME GUSTA")) {
                            for (int i = 3; i <= 8; i++) {
                                sumaLikesTW += Integer.parseInt(columnas[i]);
                            }
                        }

                        if (columnas[0].equalsIgnoreCase("YOUTUBE") && columnas[1].contains("ME GUSTA")) {
                            for (int i = 3; i <= 14; i++) {
                                sumaLikesYT += Integer.parseInt(columnas[i]);
                            }
                        }


                        renglon = "";

                    }
                    //System.out.print((char) byteLeido);
                }

                int diferenciaTwitter = twitterJunio -twitterEnero;
                System.out.println("------DIFERENCIA DE SEGUIDORES TWITTER-----");
                System.out.println("Seguidores Twitter Enero: " + twitterEnero);
                System.out.println("Seguidores Twitter Junio " + twitterJunio);
                System.out.println("La diferencia de seguidores en Twitter es de: " + diferenciaTwitter);
                System.out.println("----------------------------------------------");

                int diferenciaYoutube = ytFin - ytInicio;
                System.out.println("------COMPARADOR VISUALIZACIONES DE YOUTUBE-----");
                System.out.println("Visualizaciones mes inicial: " + ytInicio);
                System.out.println("Visualizaciones mes final: " + ytFin);
                System.out.println("La diferencia de visualizaciones en Youtube es de: " + diferenciaYoutube);

                double promedioFB = sumaCrecimientoFB / 6.0;
                double promedioTW = sumaCrecimientoTW / 6.0;
                System.out.println("----------------------------");
                System.out.println("Promedio de crecimiento mensual de Facebook (Enero-Junio): " + promedioFB);
                System.out.println("Promedio de crecimiento mensual de Twitter (Enero-Junio): " + promedioTW);


                double promedioLikesFB = sumaLikesFB / 6.0;
                double promedioLikesTW = sumaLikesTW / 6.0;
                double promedioLikesYT = sumaLikesYT / 12.0;
                System.out.println("-----------------------------");
                System.out.println("Promedio de 'me gusta' en Facebook: " + promedioLikesFB);
                System.out.println("Promedio de 'me gusta' en Twitter: " + promedioLikesTW);
                System.out.println("Promedio de 'me gusta' en Youtube: " + promedioLikesYT);





            } catch (IOException e) {
                System.out.println("Error al leer el archivo." + e.getMessage());
            }
        }

}


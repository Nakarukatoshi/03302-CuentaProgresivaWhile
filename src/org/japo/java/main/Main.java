/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final int CUENTA_INI = 0;
        final int CUENTA_FIN = 10;

        //Variables
        int i = CUENTA_INI;

        //Bucle
        while (i < CUENTA_FIN) {
            //Mensaje de salida
            System.out.println(i);

            //Actualización
            i++;
        }
    }
}

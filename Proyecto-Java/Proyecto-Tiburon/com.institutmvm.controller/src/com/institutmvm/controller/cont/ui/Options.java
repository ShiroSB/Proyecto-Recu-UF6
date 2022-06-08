package com.institutmvm.controller.cont.ui;
import javax.swing.*;
import java.awt.*;
import Utils.SQL;
import cat.institutmvm.apps.entities.Pajaros;
import cat.institutmvm.apps.entities.Pez;
import cat.institutmvm.apps.entities.Tiburones;

public class Options {

    /**
     * Creacion de los JTextField
     */

    private static JRadioButton boolean_true,boolean_false;
    private static JTextField especie = new JTextField();
    private static JTextField habitat = new JTextField();
    private static JTextField tiempo_navegacion = new JTextField();
    private static JTextField hora_llegada = new JTextField();
    private static JTextField size = new JTextField();
    private static JTextField viento = new JTextField();
    private static JTextField nubosidad = new JTextField();
    private static JTextField embarcaciones = new JTextField();
    private static JComboBox caja2 = new JComboBox();
    private static JComboBox caja3 = new JComboBox();
    private static JComboBox prof = new JComboBox();

    private static JComboBox herida = new JComboBox();

    public static JPanel BaseFrom(int rows, int cols) {
        JPanel Form_Standard = new JPanel(new GridLayout(rows, cols));

        /**
         * Generacion del formulario Standar
         */

        Form_Standard.add(new JLabel("Especie"));
        Form_Standard.add(especie);

        Form_Standard.add(new JLabel("Habitat"));
        Form_Standard.add(habitat);

        Form_Standard.add(new JLabel("Tiempo de navegacion"));
        Form_Standard.add(tiempo_navegacion);

        /**
         * Generacion de un label de multiples opciones
         */

        String[] genero = {"","Macho","Hembra","Indefinido"};
        Form_Standard.add(new JLabel("Genero"));
        caja2 = new JComboBox(genero);
        Form_Standard.add(caja2);

        Form_Standard.add(new JLabel("Hora de llegada"));
        Form_Standard.add(hora_llegada);

        Form_Standard.add(new JLabel("Tamaño"));
        Form_Standard.add(size);

        Form_Standard.add(new JLabel("Viento"));
        Form_Standard.add(viento);

        /**
         * Generacion de un label de multiples opciones
         */

        String[] direccion_viento = {"","Sur","Norte","Oeste","Este"};
        Form_Standard.add(new JLabel("Direccion del viento"));
        caja3 = new JComboBox(direccion_viento);
        Form_Standard.add(caja3);

        Form_Standard.add(new JLabel("Nubosidad"));
        Form_Standard.add(nubosidad);

        Form_Standard.add(new JLabel("Embarcaciones"));
        Form_Standard.add(embarcaciones);

        return Form_Standard;
    }

    public static void PajarosOptions(){

        /**
         * Definicion de las columnas y filas del formulario de {@code Pajaro}
         * Y ademas la creacion del formulario personalizado de {@code Pajaro}
         */



        JPanel Form_Pajaro = BaseFrom(3,5);

        Form_Pajaro.add(new JLabel("Parasitos"));
        Form_Pajaro.add(Box.createRigidArea(new Dimension(50, 30)));

        /**
         * Encargado del texto en las opciones del Booleano
         */

        boolean_true = new JRadioButton("Si");
        boolean_false = new JRadioButton("No");

        boolean_true.addChangeListener(l -> {
            if (boolean_true.isSelected()) {
                boolean_false.setSelected(false);
            }
        });
        Form_Pajaro.add(boolean_true);

        boolean_false.addChangeListener(l -> {
            if (boolean_false.isSelected()) {
                boolean_true.setSelected(false);
            }
        });




        Form_Pajaro.add(boolean_false);

        /**
         * Comprobacion de espacion en blanco con la funcion de {get.text().equals("")
         */
        int comprobacion_datos = JOptionPane.showConfirmDialog(null, Form_Pajaro, "Pajaros",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (comprobacion_datos == JOptionPane.OK_OPTION){

            if (especie.getText().equals("") || habitat.getText().equals("") || tiempo_navegacion.getText().equals("") || viento.getText().equals("")
                    || size.getText().equals("") || nubosidad.getText().equals("") || embarcaciones.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos", "Error",
                        JOptionPane.ERROR_MESSAGE);
                /**
                 * Ejecucion de nuevo de la funcion que genera nuestro formulario
                 */

                PajarosOptions();

            }

            String direccion_viento = caja3.getSelectedItem().toString();

            String genero = caja2.getSelectedItem().toString();

            Float tama = Float.valueOf(0);
            if (!size.getText().matches("[a-zA-Z]+")){
                tama = Float.parseFloat(size.getText());
            }

            Float embar = Float.valueOf(0);
            if (!embarcaciones.getText().matches("[a-zA-Z]+")){
                embar = Float.parseFloat(embarcaciones.getText());
            }




            Pajaros DATOS_BD_PAJARO = new Pajaros(especie.getText(),genero,habitat.getText(),tiempo_navegacion.getText(),hora_llegada.getText(),viento.getText(),
                    nubosidad.getText(),direccion_viento,tama,embar);


            if (boolean_true.isSelected()){
                DATOS_BD_PAJARO.setParasitos(true);
            }

            SQL insert = new SQL();

            insert.insert(DATOS_BD_PAJARO);

        }

    }


    public static void PezOptions(){

        /**
         * Definicion de las columnas y filas del formulario de {@code Pez}
         * Y ademas la creacion del formulario personalizado de {@code Pez}
         */
        JTextField n_anzuelos = new JTextField();
        JTextField t_anzuelos = new JTextField();

        JPanel Form_Pez = BaseFrom(4,5);

        Form_Pez.add(new JLabel("Numero Anzuelos"));
        Form_Pez.add(n_anzuelos);

        Form_Pez.add(new JLabel("Tipo de Anzuelos"));
        Form_Pez.add(t_anzuelos);

        /**
         * Generacion de un label de multiples opciones
         */

        String[] profundidad = {"<100M","<200M","<300M","<400M","<500M","<1000M","≥1000"};
        Form_Pez.add(new JLabel("Profundidad"));
        JComboBox prof = new JComboBox(profundidad);
        Form_Pez.add(prof);

        Form_Pez.add(new JLabel("Presencia Anzuelos"));
        Form_Pez.add(Box.createRigidArea(new Dimension(50, 30)));

        boolean_true = new JRadioButton("Si");
        boolean_false = new JRadioButton("No");

        boolean_true.addChangeListener(l -> {
            if (boolean_true.isSelected()) {
                boolean_false.setSelected(false);
            }
        });
        Form_Pez.add(boolean_true);

        boolean_false.addChangeListener(l -> {
            if (boolean_false.isSelected()) {
                boolean_true.setSelected(false);
            }
        });
        Form_Pez.add(boolean_false);
        /**
         * Comprobacion de espacion en blanco con la funcion de {get.text().equals("")
         */
        int comprobacion_datos = JOptionPane.showConfirmDialog(null, Form_Pez, "Peces",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (comprobacion_datos == JOptionPane.OK_OPTION){

            if (especie.getText().equals("") || habitat.getText().equals("") || tiempo_navegacion.getText().equals("") || viento.getText().equals("")
                    || size.getText().equals("") || nubosidad.getText().equals("") || embarcaciones.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos", "Error",
                        JOptionPane.ERROR_MESSAGE);
                /**
                 * Ejecucion de nuevo de la funcion que genera nuestro formulario
                 */
                PezOptions();
            }

            String direccion_viento = caja3.getSelectedItem().toString();

            String genero = caja2.getSelectedItem().toString();

            Float tama = Float.valueOf(0);
            if (!size.getText().matches("[a-zA-Z]+")){
                tama = Float.parseFloat(size.getText());
            }

            Float embar = Float.valueOf(0);
            if (!embarcaciones.getText().matches("[a-zA-Z]+")){
                embar = Float.parseFloat(embarcaciones.getText());
            }

            String profundida = prof.getSelectedItem().toString();


            Pez DATOS_BD_PECES = new Pez(especie.getText(),genero,habitat.getText(),tiempo_navegacion.getText(),hora_llegada.getText(),viento.getText(),
                    nubosidad.getText(),direccion_viento,tama,embar);

            if (boolean_true.isSelected()){
                DATOS_BD_PECES.setP_anzuelos(true);
            }

            DATOS_BD_PECES.setT_anzuelo(t_anzuelos.getText());


            int N_anzuelos = 0;
            if (!size.getText().matches("[a-zA-Z]+")){
                 N_anzuelos = Integer.parseInt(n_anzuelos.getText());
            }

            DATOS_BD_PECES.setN_anzuelos(N_anzuelos);

            DATOS_BD_PECES.setProfundidad(profundida);

            SQL insert = new SQL();

            insert.insert3(DATOS_BD_PECES);

        }
    }

    public static void TiburonOptions(){
        /**
         * Definicion de las columnas y filas del formulario de {@code Tiburones}
         * Y ademas la creacion del formulario personalizado de {@code Tiburones}
         */
        JPanel Form_Tiburon = BaseFrom(8,6);

        Form_Tiburon.add(new JLabel("Heridas"));
        Form_Tiburon.add(Box.createRigidArea(new Dimension(50, 30)));

        /**
         * Generacion de un label de multiples opciones
         */

        String[] profundidad = {"<100M","<200M","<300M","<400M","<500M","<1000M","≥1000"};
        Form_Tiburon.add(new JLabel("Profundidad"));
        prof = new JComboBox(profundidad);
        Form_Tiburon.add(prof);

        boolean_true = new JRadioButton("Si");
        boolean_false = new JRadioButton("No");

        boolean_true.addChangeListener(l -> {
            if (boolean_true.isSelected()) {
                boolean_false.setSelected(false);
            }
        });
        Form_Tiburon.add(boolean_true);

        boolean_false.addChangeListener(l -> {
            if (boolean_false.isSelected()) {
                boolean_true.setSelected(false);
            }
        });
        Form_Tiburon.add(boolean_false);
        /**
         * Comprobacion de espacios en blanco con la funcion de {get.text().equals("")
         */
        int comprobacion_datos = JOptionPane.showConfirmDialog(null, Form_Tiburon, "Tiburones",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (comprobacion_datos == JOptionPane.OK_OPTION){

           if (especie.getText().equals("") || habitat.getText().equals("") || tiempo_navegacion.getText().equals("") || viento.getText().equals("")
                   || size.getText().equals("") || nubosidad.getText().equals("") || embarcaciones.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos", "Error",
                       JOptionPane.ERROR_MESSAGE);
               /**
                * Ejecucion de nuevo de la funcion que genera nuestro formulario
                */
               TiburonOptions();
           }

            String direccion_viento = caja3.getSelectedItem().toString();

            String genero = caja2.getSelectedItem().toString();

            Float tama = Float.valueOf(0);
            if (!size.getText().matches("[a-zA-Z]+")){
                tama = Float.parseFloat(size.getText());
            }

            Float embar = Float.valueOf(0);
            if (!embarcaciones.getText().matches("[a-zA-Z]+")){
                embar = Float.parseFloat(embarcaciones.getText());
            }

            String profundida = prof.getSelectedItem().toString();


            Tiburones DATOS_BD_TIBURONES = new Tiburones(especie.getText(),genero,habitat.getText(),tiempo_navegacion.getText(),hora_llegada.getText(),viento.getText(),
                    nubosidad.getText(),direccion_viento,tama,embar);

            if (boolean_true.isSelected()){
                DATOS_BD_TIBURONES.setHeridas(String.valueOf(true));
            }else {
                DATOS_BD_TIBURONES.setHeridas(String.valueOf(false));
            }

            DATOS_BD_TIBURONES.setProfundidad(profundida);


            SQL insert = new SQL();

            insert.insert2(DATOS_BD_TIBURONES);


        }

    }

}

package com.uady.jorge_cano.serviciosatualcance.dao;

import com.uady.jorge_cano.serviciosatualcance.model.Professional;

import java.util.ArrayList;

/**
 * Created by jeremiah on 19/11/2017.
 */

public class ProfessionalsData {

    public static ArrayList<Professional> getElectricistasData(){
        ArrayList<Professional> electricistas = new ArrayList<>();

        electricistas.add(new Professional("Servicios en Electricidad, Plomería, Pintura, etc.",
                "Calle 30 # 461 x 37 Colonia Centro 97000 Mérida, Yucatán",
                "servielectitricadplomeria@gmail.com",
                "9994172033",
                new String[]{"Servicios generales en electricidad", "Plomería en baños completos","Climas","Bombas de agua","Hidroneumáticos", "Piscinas", "Sistemas de riego","Pintura", "Impermeabilizaciones", "Gas", "Etc"},
                6.4f
                ));

        electricistas.add(new Professional("Electricidad y Plomeria",
                "Calle 23 # 296 x 20 y 22 Col. Maria Luisa 97199 Mérida Yucatán",
                "josearmando.electricoyplomero@hotmail.com",
                "9992678160",
                new String[]{"Plomeria y Electricidad","Mantenimiento a todo lo relativo a Baños","Casas", "Reparación de toda la instalación y cableria", "Instalación de Calentadores"},
                2.3f
        ));

        electricistas.add(new Professional("ELETRICIDAD Y PLOMERIA LOPEZ",
                "CALLE 78 # 304 POR 45, CENTRO, C P 97000 MÉRIDA YUCATÁN",
                "electricidadyplomerialopez@gmail.com",
                "9994121575",
                new String[]{"Servicios de electricidas", "Plomeria","Climas", "Hidroneumaticos","Piscinas", "Sistemas de riego", "Baños completos", "Líneas eléctricas bifásicas", "Monofásicas", "Trifásicas", "Etc", "Servicios garantizados"},
                5.8f
        ));

        electricistas.add(new Professional("Multiserv",
                "Calle 17 # 12, Centro. C P 97000 Mérida Yucatán",
                "multiservelec@hotmail.com",
                "9999700167",
                new String[]{"Servicios de plomeros", "Electricidad", "Albañilería en Mérida Yucatán"},
                6.0f
        ));

        electricistas.add(new Professional("Electricista Alejandro Riego",
                "C. 74 x 61 y 63a Centro Mérida",
                "alexelecricista@gmail.com",
                "9995874447",
                new String[]{"Instalación de enchufes","Ampliación de contactos", "Instalación de ventiladores", "Etc."},
                5.9f
        ));

        electricistas.add(new Professional("Servicios Alexa",
                "Calle 60 # 565 por 45, Centro. C P 97000 Mérida Yucatán",
                "alexaservicios@hotmail.com",
                "9995064424",
                new String[]{"Plomeria y Electricidad","Mantenimiento a todo lo relativo a Baños","Casas", "Reparación de toda la instalación y cableria", "Instalación de Calentadores"},
                6.2f
        ));

        electricistas.add(new Professional("Servicios Ruiz",
                "Calle 10 # 476 entre 37 y 39, Col. Granjas C. P. 97125 Mérida Yucatán",
                "ruizserviciosplomeria@hotmail.com",
                "9991102454",
                new String[]{"Servicios de plomería y electricidad", "Climas", "Sistema de riego", "Calentadores", "Mejoramos cualquier presupuesto","Nosotros sí resolvemos el problema", "Trabajos garantizados"},
                4.1f
        ));

        electricistas.add(new Professional("Servicios Adrian en electricidad y plomeria",
                "Calle 44a # 911 por 65 y 67, Centro 97000. Mérida Yucatán",
                "serviciosplomeriaadrian@gmail.com",
                "9991628620",
                new String[]{"Servicios de electricidad", "Plomería y albañilería", "Reparaciones y mantenimiento en su casa o negocio", "Baños completos","Bombas", "Sistemas eléctricos monofasica, bifasica, trifasica", "Calentadores", "Hidroneumáticos", "Piscinas", "Impermeabilizacion", "Pintura", "Sistemas de riego", "Etc", "Atendemos trabajos urgentes"},
                5.8f
        ));

        return electricistas;
    }

    public static ArrayList<Professional> getPlomerosData(){
        ArrayList<Professional> plomeros = new ArrayList<>();

        plomeros.add(new Professional("MULTISERVICIOS CAHUM",
                "Calle 145 # 329 por 64 Y 66, Colonia San José Tecoh Sur 2. C P 97298 Mérida Yucatán",
                "cahumservicios@hotmail.com",
                "9992024383",
                new String[]{"SERVICIOS DE PLOMERIA", "ELECTRICIDAD DE BAJA Y MEDIA TENCION", "INSTALACION Y MANTENIMIENTO DE AIRES ACONDICIONADOS TIPO SPLIT", "TRABAJOS SERIOS, GARANTIZADOS Y ECONOMICOS"},
                4.7f
        ));

        plomeros.add(new Professional("Servicios en eletricidad y plomeria",
                "Calle 65b # 641 por 36, Centro. C P 97000, Mérida Yucatáan",
                "mariopereiraelectrico@gmail.com",
                "9991022601",
                new String[]{"Servicios completos en electricidad y plomeria", "Baños completos", "Sistemas eléctricos", "Bombas", "Centros de carga", "Piscinas", "Climas", "Albañilería", "Sistemas de gas", "Etc", "Llámenos 24hrs"},
                5.9f
        ));

        plomeros.add(new Professional("ELETRICIDAD Y PLOMERIA ANDRES",
                "Calle 63 # 654 por 66, Centro. C P 97000 Mérida Yucatán",
                "",
                "9994187899",
                new String[]{" Servicios de electricidad y plomería", "Baños completos", "Lóneas eléctricas", "Piscinas","Calentadores","Bombas", "Hidroneumáticas", "Climas", "Etc", "Llámenos 24 hrs"},
                6.0f
        ));

        plomeros.add(new Professional("Electricidad y Plomeria",
                "Calle 23 # 296 x 20 y 22 Col. Maria Luisa 97199 Mérida Yucatán",
                "josearmando.electricoyplomero@hotmail.com",
                "9992678160",
                new String[]{"Plomeria y Electricidad","Mantenimiento a todo lo relativo a Baños","Casas", "Reparación de toda la instalación y cableria", "Instalación de Calentadores"},
                2.3f
        ));

        plomeros.add(new Professional("ELETRICIDAD Y PLOMERIA LOPEZ",
                "CALLE 78 # 304 POR 45, CENTRO, C P 97000 MÉRIDA YUCATÁN",
                "electricidadyplomerialopez@gmail.com",
                "9994121575",
                new String[]{"Servicios de electricidad", "Plomeria", "Climas", "Hidroneumáticos", "Piscinas", "Sistemas de riego", "Baños completos", "Líneas eléctricas bifásicas, monofasicas, trifasicas", "Etc", "Servicios garantizados"},
                5.8f
        ));

        plomeros.add(new Professional("Mantenimientos martin ",
                "Calle 57a # 191 por 68 y 70, Centro. C P 97000 Mérida Yucatán",
                "mantenimientomartin@hotmail.com",
                "9991001920",
                new String[]{"Servicios de eletricidad", "Plomeria en baños completos", "Boilers", "Bombas", "Hidroneumáticos", "Climas", "Piscinas", "Líneas eléctricas, bifasica, trifasica, tierra física", "Sistemas de riego" , "Etc"},
                5.8f
        ));

        plomeros.add(new Professional("SERVICIOS DE ELETRICIDAD Y PLOMERIA",
                "Calle 112 # 193 por 54 Y 56, 5 COLONIAS. C P 97000 Mérida Yucatán",
                "electricidadcolonias@gmail.com",
                "9993501728",
                new String[]{"Servicios de reparación y mantenimiento en baños completos", "Calentadores", "Bombas", "Piscinas", "Hidroneumáticos", "Lineas, bifásicas, monofásicas, trifásicas", "Llámanos a cualquier hora"},
                3.2f
        ));

        plomeros.add(new Professional("Servicios en Electricidad, Plomería, Pintura, etc.",
                "Calle 30 # 461 x 37 Colonia Centro 97000 Mérida, Yucatán",
                "servielectitricadplomeria@gmail.com",
                "9994172033",
                new String[]{"Servicios generales en electricidad", "Plomería", "Baños completos", "Climas", "Bombas de agua", "Hidroneumáticos", "Piscinas", "Sistemas de riego", "Pintura", "Impermeabilizaciones", "Gas","Etc."},
                6.4f
        ));

        return plomeros;
    }

    public static ArrayList<Professional> getJardinerosData(){
        ArrayList<Professional> jardineros = new ArrayList<>();

        jardineros.add(new Professional("La Ceiba. Espacios verdes",
                "Avenida Temozón norte pozo 8, Mérida, Yucatán",
                "laceibaverdes@gmail.com",
                "9993316228",
                new String[]{"Suministro de materiales", "Flores", "Arena", "Piedras rosadas", "Etc", "Pasto en rollos","Limpiezas", "Decoración","Diseño de jardines", "Mantenimiento de jardines"},
                7.0f
        ));

        jardineros.add(new Professional("Vivero Y Jardinería Palma Sur",
                "C. 88 #673 B Por 71 Y 71 A Fracc. Los Almendros 2, Mérida (Yucatán)",
                "palmasurjardines@hotmail.com",
                "9993352702",
                new String[]{"Diseño e instalación de jardines","Limpieza y mantenimiento de áreas","Venta de palmas y plantas ornamentales","Fumigación interior y exterior","Poda y tumba de árboles","Deshierbo y chapeo","Etc"},
                2.6f
        ));

        jardineros.add(new Professional("SemperGarden",
                " C. 35 Diagonal N° 315-B x 26 y 26-A Col. Miguel Alemán, Mérida (Yucatán)",
                "sempergarden@hotmail.com",
                "No disponible",
                new String[]{"Jardín colonial","Jardines modernos","Jardines pequeños","Decoración de jardines","Jardines en terrazas","Cuidado para plantas"},
                6.4f
        ));

        jardineros.add(new Professional("Urbania El Sembrador Mérida",
                "Calle 48 520 D, Mérida (Yucatán) ",
                "urbania@live.com.mx",
                "9855478",
                new String[]{"Herbicidas","Fungicidas","Semillas","Insecticidas","Termonebulizadora Vector Fog","Estacas para termitas ( Terminate)"},
                5.5f
        ));

        jardineros.add(new Professional("VerdeGreen",
                " Col. Norte, Mérida (Yucatán)",
                "verdegreenmerida@hotmail.com",
                "9558610",
                new String[]{"Jardines verticales (natural)","Follaje vertical (sintético)","Azoteas verdes","Muros verdes","Paisajismo"},
                4.7f
        ));

        jardineros.add(new Professional("Viveria",
                "calle 11 #245 entre 18 y 22 santa gertrudis copo. Local 27 Plaza de la Construcción,",
                "viveriajardines@hotmail.com",
                "9999853645",
                new String[]{"Jardín zen","jardín colonial","Jardines modernos","Jardines en terrazas","Huertos"},
                6.0f
        ));

        jardineros.add(new Professional("Verde Vida",
                " calle 17 # 526 E por 28 y 30. Colonia Maya, Mérida (Yucatán)",
                "verdevidajardinesmerida@hotmail.com",
                "9998556870",
                new String[]{"Diseño e instalación de jardines con vista previa en 3D para una mejor apreciación de las propuestas",
                        "Mantenimiento de jardines (poda de césped, fertilización de plantas, palmeras plantas con flores)",
                        "Programa preventivo y curativo contra plagas y enfermedades",
                        "Diseño e instalación de sistema de riego agrícola y residencial"},
                3.9f
        ));

        jardineros.add(new Professional("Happy Garden Mérida",
                "Cupules, Mérida Yucatán., Mérida (Yucatán) ",
                "happygarden@hotmail.com",
                "9999213894",
                new String[]{"Sistemas de riego","Diseño y construcción de jardines","Pasto y plantas","Fumigantes y fertilizantes","Perforación de pozos profundos"},
                5.9f
        ));

        return jardineros;
    }

    public static ArrayList<Professional> getCarpinterosData(){
        ArrayList<Professional> carpinteros = new ArrayList<>();

        carpinteros.add(new Professional("Tapicería Mante",
                "Calle 41 # 532 E x 66 y 72 Centro, (a un costado de la SPV), Mérida, Yucatán",
                "tapiceriamante@hotmail.com",
                "99 91 53 56 70",
                new String[]{"Tapicería en general", "Automotríz", "Residencial", "Industrial", "Hotelera", "Fabricación de muebles",  "Cuartos acústicos para estudios de grabación"},
                7.0f
        ));

        carpinteros.add(new Professional("Carpinteria Hans",
                "Calle 47 a # 537 por 34 y 36, Juan Pablo II. C P 97246 Mérida Yucatán",
                "hansmuebles@hotmail.com",
                "9993574769",
                new String[]{"Carpintería", "Mueblería", "Muebles de oficina", "Casa", "Negocio", "Etc", "Herrería artística", "Rejas", "Portones", "Tinglados", "Etc"},
                9.4f
        ));

        carpinteros.add(new Professional("CarpinteriaWM",
                "Calle 22 # 789 por 22, San Ramón. C P 97115 Mérida Yucatán",
                "wmcarpinteros@live.com.mx",
                "9991635826",
                new String[]{"Fabricación e instalación de mobiliario para su hogar con la mejor calidad", " Pertas", "Alacenas", "Armarios", "Muebles minimalistas", "Comedores", "Cocinas", "Closets", "Cajoneras", "Libreros", "Centros de entretenimiento", "Fabricamos sobre diseño y todo lo que se pueda realizar en madera"},
                5.6f
        ));

        carpinteros.add(new Professional("CARPINTERIA ARTE EN MADERA",
                "CALLE 29 No.741 X90 Y 92, FRACC. PUERTAS DEL PALMAR. C. P. 97314 MERIDA",
                "arteenmadera@hotmail.com",
                "9991262736",
                new String[]{"Carpintería en general", "Reparación y mantenimiento de muebles de madera", "Muebles sobre diseño", "Cocinas integrales", "Closets", "Puertas de madera"},
                3.8f
        ));

        carpinteros.add(new Professional("Carpinteria Soberano",
                "Calle 29 N°156-A Col. San Antonio Kaua II, Merida,Yucatan.",
                "No disponible",
                "(999)166 13 64",
                new String[]{"Cocinas", "Comedores", "Alacenas", "Closets", "Puertas", "Salas"},
                11.6f
        ));

        carpinteros.add(new Professional("Carpinteria Andrade",
                "Calle 69 N°968 entre 116-B y 120, Col Jardines de Nueva Mulsay,Merida,Yuc.",
                "andradecarpinteria@yahoo.mx",
                "985 47 04",
                new String[]{"Tablaroca", "Artesania", "Puertas", "Closets", "Ventanas", "Cosina", "Integral"},
                5.0f
        ));

        carpinteros.add(new Professional("Wood House",
                "30 X 39 y 41 No. 276 Loc 3. C.P. 97117, Mérida, Yucatán.",
                "woodmerida@hotmail.com",
                "9992862696",
                new String[]{"Tapiceria", "Arte", "Recepción", "Bancas", "Minimalista", "Interiorismo", "Mobiliario", "Tallados", "Interiores", "Interiorismo", "Ebanisteria", "Carpintería", "Mobiliarias", "Diseño"},
                10.7f
        ));

        carpinteros.add(new Professional("Wood & Deco",
                "Periferico Nte S/N X 21. Chuburna de Hidalgo.. C.P. 97200, Mérida, Yucatán",
                "decowoodmid@hotmail.com",
                "1952021",
                new String[]{"Tejaban de Madera", "Closets", "Diseños Sobre Medida", "Remodelamiento y Reparacion", "Producción de Puertos de Madera", "Pintura de Elementos"},
                9.0f
        ));

        return carpinteros;
    }
    
}

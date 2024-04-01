import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.plaf.TreeUI;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BasicStroke;

public class Examen extends JFrame
{
	public Examen() 
    {
        this.setVisible(true);
        this.setSize(750, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(" ");
        this.setMinimumSize(new Dimension(250,250));
        this.setMaximumSize(new Dimension(1100,2000));
        this.setResizable(true);
        this.setLocation(200,200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.iniciarComponentes();
        
    }

    public void iniciarComponentes(){

        this.facturacion();

        this.repaint();
        this.validate();
    }

    public void facturacion(){

        JPanel facturacion = new JPanel();
        facturacion.setSize(this.getWidth(), this.getHeight());
        facturacion.setBackground(Color.white);
        facturacion.setLayout(null);

        JLabel texto1 = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
        texto1.setBounds(20, 20, 1000, 30);
        texto1.setOpaque(true);
        texto1.setBackground(Color.decode("#20AFDE"));
        texto1.setFont(new Font("Arial", Font.BOLD, 25));
        texto1.setHorizontalAlignment(SwingConstants.LEFT);
        texto1.setForeground(Color.white);
        facturacion.add(texto1);

        JLabel texto2 = new JLabel("[sin bases de datos]");
        texto2.setBounds(20, 40, 1000, 50);
        texto2.setOpaque(true);
        texto2.setBackground(Color.decode("#20AFDE"));
        texto2.setFont(new Font("Arial", Font.PLAIN, 15));
        texto2.setHorizontalAlignment(SwingConstants.LEFT);
        texto2.setForeground(Color.white);
        facturacion.add(texto2);

        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, 1000, 100);
        fondo.setOpaque(true);
        fondo.setBackground(Color.decode("#20AFDE"));
        facturacion.add(fondo);

        //Datos del cliente

        JLabel cliente = new JLabel("Datos del cliente");
        cliente.setBounds(50, 120, 150, 25);
        cliente.setBackground(Color.WHITE);
        cliente.setOpaque(true);
        cliente.setFont(new Font("Arial", Font.PLAIN, 15));
        cliente.setForeground(Color.BLACK);
        facturacion.add(cliente);

        JLabel documento = new JLabel("Documento: ");
        documento.setBounds(50, 175, 150, 25);
        documento.setBackground(Color.WHITE);
        documento.setOpaque(true);
        documento.setFont(new Font("Arial", Font.PLAIN, 15));
        documento.setForeground(Color.BLACK);
        facturacion.add(documento);

        JTextField documento_text = new JTextField();
        documento_text.setBounds(150, 175, 150, 25);
        documento_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        facturacion.add(documento_text);

        JLabel direccion = new JLabel("Dirección: ");
        direccion.setBounds(50, 220, 150, 25);
        direccion.setBackground(Color.WHITE);
        direccion.setOpaque(true);
        direccion.setFont(new Font("Arial", Font.PLAIN, 15));
        direccion.setForeground(Color.BLACK);
        facturacion.add(direccion);

        JTextField direccion_text = new JTextField();
        direccion_text.setBounds(150, 220, 150, 25);
        direccion_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        facturacion.add(direccion_text);

        JLabel nombre = new JLabel("Nombre completo: ");
        nombre.setBounds(400, 175, 150, 25);
        nombre.setBackground(Color.WHITE);
        nombre.setOpaque(true);
        nombre.setFont(new Font("Arial", Font.PLAIN, 15));
        nombre.setForeground(Color.BLACK);
        facturacion.add(nombre);

        JTextField nombre_text = new JTextField();
        nombre_text.setBounds(540, 175, 150, 25);
        nombre_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        facturacion.add(nombre_text);

        JLabel telefono = new JLabel("Teléfono: ");
        telefono.setBounds(400, 220, 150, 25);
        telefono.setBackground(Color.WHITE);
        telefono.setOpaque(true);
        telefono.setFont(new Font("Arial", Font.PLAIN, 15));
        telefono.setForeground(Color.BLACK);
        facturacion.add(telefono);

        JTextField telefono_text = new JTextField();
        telefono_text.setBounds(540, 220, 150, 25);
        telefono_text.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        facturacion.add(telefono_text);

        //Datos de la factura

        JLabel factura = new JLabel("Datos de la Factura");
        factura.setBounds(50, 280, 150, 25);
        factura.setBackground(Color.WHITE);
        factura.setOpaque(true);
        factura.setFont(new Font("Arial", Font.PLAIN, 15));
        factura.setForeground(Color.BLACK);
        facturacion.add(factura);

        JLabel numero_factura = new JLabel("Nº Factura: ");
        numero_factura.setBounds(50, 320, 100, 25);
        numero_factura.setBackground(Color.WHITE);
        numero_factura.setOpaque(true);
        numero_factura.setFont(new Font("Arial", Font.PLAIN, 15));
        numero_factura.setForeground(Color.BLACK);
        facturacion.add(numero_factura);

        JLabel numero_factura_text = new JLabel("1");
        numero_factura_text.setBounds(150, 320, 150, 25);
        numero_factura_text.setFont(new Font("Times New Roman", Font.BOLD, 15));
        facturacion.add(numero_factura_text);

        JLabel fecha = new JLabel("Fecha: ");
        fecha.setBounds(400, 320, 50, 25);
        fecha.setBackground(Color.WHITE);
        fecha.setOpaque(true);
        fecha.setFont(new Font("Arial", Font.PLAIN, 15));
        fecha.setForeground(Color.BLACK);
        facturacion.add(fecha);

        JLabel fecha_text = new JLabel("31/03/2024");
        fecha_text.setBounds(540, 320, 150, 25);
        fecha_text.setFont(new Font("Times New Roman", Font.BOLD, 15));
        facturacion.add(fecha_text);

        //Tabla de los productos

        JLabel lista = new JLabel("Ver listado de facturas");
        lista.setBounds(100, 361, 200, 25);
        lista.setBackground(Color.WHITE);
        lista.setOpaque(true);
        lista.setFont(new Font("Arial", Font.PLAIN, 15));
        lista.setForeground(Color.BLACK);
        facturacion.add(lista);

        JLabel lista_imagen = new JLabel();
        lista_imagen.setIcon(new ImageIcon(getClass().getResource("lista.png")));
        lista_imagen.setBounds(50, 350, 50, 50);
        facturacion.add(lista_imagen);

        JLabel añadir = new JLabel("Añadir");
        añadir.setBounds(490, 361, 50, 25);
        añadir.setBackground(Color.WHITE);
        añadir.setOpaque(true);
        añadir.setFont(new Font("Arial", Font.PLAIN, 15));
        añadir.setForeground(Color.BLACK);
        facturacion.add(añadir);
        
        JLabel añadir_imagen = new JLabel();
        añadir_imagen.setIcon(new ImageIcon(getClass().getResource("añadir.png")));
        añadir_imagen.setBounds(450, 350, 50, 50);
        facturacion.add(añadir_imagen);

        JLabel eliminar = new JLabel("Eliminar");
        eliminar.setBounds(590, 361, 100, 25);
        eliminar.setBackground(Color.WHITE);
        eliminar.setOpaque(true);
        eliminar.setFont(new Font("Arial", Font.PLAIN, 15));
        eliminar.setForeground(Color.BLACK);
        facturacion.add(eliminar);
        
        JLabel eliminar_imagen = new JLabel();
        eliminar_imagen.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
        eliminar_imagen.setBounds(550, 350, 50, 50);
        facturacion.add(eliminar_imagen);


		String titulo_tabla[] = {"Producto", "Cantidad","Valor", "Subtotal"};

		String datos_tabla [][] = {

			{"Agua", "2","500", "1000.0"},
			{"Cereal", "5","1000", "5000.0"},
			{"Leche", "2","300", "600.0"}
		};

		JTable tabla1 = new JTable(datos_tabla,titulo_tabla);
		JScrollPane tabla2 = new JScrollPane(tabla1);
		tabla2.setBounds(50, 400, 600, 120);
		facturacion.add(tabla2);

        //Detalles del precio final

        JLabel subtotal = new JLabel("SubTotal: ");
        subtotal.setBounds(50, 550, 100, 25);
        subtotal.setBackground(Color.WHITE);
        subtotal.setOpaque(true);
        subtotal.setFont(new Font("Arial", Font.PLAIN, 15));
        subtotal.setForeground(Color.BLACK);
        facturacion.add(subtotal);

        JLabel descuento = new JLabel("% Descuetno: ");
        descuento.setBounds(50, 580, 100, 25);
        descuento.setBackground(Color.WHITE);
        descuento.setOpaque(true);
        descuento.setFont(new Font("Arial", Font.PLAIN, 15));
        descuento.setForeground(Color.BLACK);
        facturacion.add(descuento);

        JTextField cantidad_descuento = new JTextField();
        cantidad_descuento.setBounds(150, 580, 35, 25);
        cantidad_descuento.setBackground(Color.WHITE);
        cantidad_descuento.setOpaque(true);
        cantidad_descuento.setFont(new Font("Arial", Font.PLAIN, 15));
        cantidad_descuento.setForeground(Color.BLACK);
        facturacion.add(cantidad_descuento);

        JCheckBox validar_descuento = new JCheckBox();
		validar_descuento.setBounds(200,565,50,50);
        validar_descuento.setBackground(Color.WHITE);
        validar_descuento.setOpaque(true);
		facturacion.add(validar_descuento);

        JLabel valor_descuento = new JLabel("Valor Descontado: ");
        valor_descuento.setBounds(250, 580, 130, 25);
        valor_descuento.setBackground(Color.WHITE);
        valor_descuento.setOpaque(true);
        valor_descuento.setFont(new Font("Arial", Font.PLAIN, 15));
        valor_descuento.setForeground(Color.BLACK);
        facturacion.add(valor_descuento);

        JLabel valor_descuento1 = new JLabel("330.0");
        valor_descuento1.setBounds(390, 580, 150, 25);
        valor_descuento1.setBackground(Color.WHITE);
        valor_descuento1.setOpaque(true);
        valor_descuento1.setFont(new Font("Arial", Font.BOLD, 15));
        valor_descuento1.setForeground(Color.BLACK);
        facturacion.add(valor_descuento1);

        JLabel iva = new JLabel("IVA 19%: ");
        iva.setBounds(50, 615, 100, 25);
        iva.setBackground(Color.WHITE);
        iva.setOpaque(true);
        iva.setFont(new Font("Arial", Font.PLAIN, 15));
        iva.setForeground(Color.BLACK);
        facturacion.add(iva);

        JLabel iva1 = new JLabel("1254.0");
        iva1.setBounds(200, 615, 100, 25);
        iva1.setBackground(Color.WHITE);
        iva1.setOpaque(true);
        iva1.setFont(new Font("Arial", Font.BOLD, 15));
        iva1.setForeground(Color.BLACK);
        facturacion.add(iva1);

        JLabel factura_total = new JLabel("Total de la Factura: ");
        factura_total.setBounds(50, 650, 150, 25);
        factura_total.setBackground(Color.WHITE);
        factura_total.setOpaque(true);
        factura_total.setFont(new Font("Arial", Font.PLAIN, 15));
        factura_total.setForeground(Color.BLACK);
        facturacion.add(factura_total);

        JLabel factura_total1 = new JLabel("7524.0");
        factura_total1.setBounds(200, 650, 100, 25);
        factura_total1.setBackground(Color.WHITE);
        factura_total1.setOpaque(true);
        factura_total1.setFont(new Font("Arial", Font.BOLD, 15));
        factura_total1.setForeground(Color.BLACK);
        facturacion.add(factura_total1);

        //Botones para finalizar

        JButton finalizar = new JButton("Finalizar Factura");
        finalizar.setBounds(400, 700, 180, 25);
        finalizar.setBackground(Color.WHITE);
        finalizar.setOpaque(true);
        finalizar.setFont(new Font("Arial", Font.BOLD, 15));
        finalizar.setForeground(Color.BLACK);
        facturacion.add(finalizar);

        JButton limpeza = new JButton("Limpiar Datos");
        limpeza.setBounds(590, 700, 140, 25);
        limpeza.setBackground(Color.WHITE);
        limpeza.setOpaque(true);
        limpeza.setFont(new Font("Arial", Font.BOLD, 15));
        limpeza.setForeground(Color.BLACK);
        facturacion.add(limpeza);

        //Color del final

        JPanel colo_final = new JPanel();
        colo_final.setBackground(Color.decode("#20AFDE"));
        colo_final.setBounds(0, 730, 800, 100);
        facturacion.add(colo_final);

        this.add(facturacion);

    }
}
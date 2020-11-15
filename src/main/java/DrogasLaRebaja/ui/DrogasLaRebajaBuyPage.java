package DrogasLaRebaja.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class DrogasLaRebajaBuyPage {

    public static final Target BOTONBUSCAR = Target.the("Boton buscar").located(By.id("busqueda"));

    public static final Target BOTONMAS = Target.the("Boton adicionar").located(By.id("aumentar-unidad-17152"));

    public static Target BOTONADICIONARCARRITO = Target.the("boton adicionar al carro")
            .located(By.xpath("(//div[@class='contentBtnAdd']//div[@class='buttonDefaultShop'])[last()-19]"));

    public static Target BOTONPORCIUDAD = Target.the("Boton por ciudad")
            .located(By.xpath("//button[@class='boton-tipo-ubicacion']/span[@class='rojo']"));

    public static Target TEXTOCOMPARACION = Target.the("texto comparacion")
            .located(By.xpath("//p[contains(text(), 'Paga contra entrega.')][last()]"));

}

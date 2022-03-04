package es.aytos.fpdual.fpdualMyBatis2022;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.*;

import javax.annotation.*;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import es.aytos.fpdual.fpdual2022MyBatis.interfaz.*;
import es.aytos.fpdual.fpdual2022MyBatis.mapper.*;
import es.aytos.fpdual.fpdual2022MyBatis.modelo.*;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = { "classpath:application-context.xml" })
@SuppressWarnings("deprecation")
// @Transactional
// @Rollback
public class AppTest {

    private ServicioHacienda servicioHacienda = null;

    @SuppressWarnings("restriction")
    @Resource
    private ServicioHaciendaMapper servicioHaciendaMapper;

    @Before
    public void inicializar() {
        this.servicioHacienda = this.servicioHaciendaMapper; // Spring
    }

    @Test
    public void testConsultaCiudadanos() {
        List<Ciudadano> poblacion = this.servicioHacienda.consultarCiudadanos();

        for (Ciudadano c : poblacion) {
            System.out.println(c.getNombre());
        }

        assertThat(poblacion.size(), is(greaterThan(0)));
    }

}
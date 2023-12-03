package controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import server.repository.RestaurantRepository;
import server.service.RestaurantService;

import static org.assertj.core.api.BDDAssumptions.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

//@ExtendWith(SpringExtension.class)

//@ContextConfiguration(classes = {RestaurantApplication.class, SampleUnitTestConfig.class})

@RunWith(SpringRunner.class)
@WebMvcTest(RestaurantController.class)
public class RestaurantControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RestaurantService restaurantService;

    @MockBean
    private RestaurantRepository restaurantRepository;

    @Test
    public void testSayHello() throws Exception {

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/sayHello/");
        String result = mockMvc.perform(requestBuilder).andReturn().getResponse().getContentAsString();

        assertEquals("Hello World!", result);
    }


}

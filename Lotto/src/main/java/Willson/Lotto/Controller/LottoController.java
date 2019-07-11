package Willson.Lotto.Controller;

import Willson.Lotto.Generator.HardGenerator;
import Willson.Lotto.Generator.LottoGenerator;
import Willson.Lotto.Generator.SimpleLottoGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LottoController {

    private LottoGenerator lottoGenerator;

//    Jesli mamy pole tupy interfejsowego
//    to przy inicializacji zmiennej musi stworzyc
//    obiekt klasy, ktora implementuje dany interfejs
//    czyli w tym przypadku LottoGenerator

    public void setLottoGenerator(LottoGenerator lottoGenerator){
        this.lottoGenerator = lottoGenerator;
    }

    @GetMapping("/")
    public String generateRandomData(ModelMap map) {
        setLottoGenerator(new HardGenerator());
        map.put("numbers",lottoGenerator.generateDescription());
        return "lotto";
    }
}

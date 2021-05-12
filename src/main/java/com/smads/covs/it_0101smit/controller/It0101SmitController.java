package com.smads.covs.it_0101smit.controller;

import com.smads.covs.it_0101smit.services.VDistritoDmService;
import com.smads.covs.it_0101smit.services.VSubprefeituraDmService;
import com.sun.jdi.IntegerValue;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/it0101")
public class It0101SmitController {

  private final VDistritoDmService vDistritoDmService;
  private final VSubprefeituraDmService vSubprefeituraDmService;

  private List<String> lstEndereco;

  public It0101SmitController(VDistritoDmService vDistritoDmService, VSubprefeituraDmService vSubprefeituraDmService) {
    this.vDistritoDmService = vDistritoDmService;
    this.vSubprefeituraDmService = vSubprefeituraDmService;
  }

  @GetMapping("/sisa")
  public ArrayList<String> it0101Data(@RequestParam String nrDistrito, @RequestParam String cdSubprefeitura) throws JSONException {

    Integer intNrDistrito = Integer.valueOf(nrDistrito);
    Integer intCdSubprefeitura = Integer.valueOf(cdSubprefeitura);

    String nmDistrito = vDistritoDmService.findVDistritoDm(intNrDistrito).getNmDistrito();
    String nmSubprefeitura = vSubprefeituraDmService.findVSubprefeituraDm(intCdSubprefeitura).getNmSubprefeitura();

    ArrayList<String> lstString = new ArrayList<>();
    lstString.add(nmDistrito);
    lstString.add(nmSubprefeitura);

    return lstString;
  }
}

package com.misiaty.webclienttestapp.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.misiaty.webclienttestapp.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Optional;

public interface BeerClient {

    Flux<String> listBeers();

    Flux<Map> listBeerMap();

    Flux<JsonNode> listBeersJsonNode();

    Flux<BeerDTO> listBeersDtos();

    Mono<BeerDTO> getBeerById(String id);

    Flux<BeerDTO> getBeerByBeerStyle(String paleAle);

    Mono<BeerDTO> createBeer(BeerDTO newDto);

    Mono<BeerDTO> updateBeer(BeerDTO beerDTO);

    Mono<BeerDTO> patchBeer(BeerDTO beerDTO);

    Mono<Void> deleteById(String id);
}

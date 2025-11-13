package tn.esprit.spring.tpcafe_areejbensalah.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import tn.esprit.spring.tpcafe_areejbensalah.DTO.CommandeRequest;
import tn.esprit.spring.tpcafe_areejbensalah.DTO.CommandeResponse;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;

// @Mapper - Définit cette interface comme un mapper MapStruct
// componentModel = "spring" - Pour l'injection Spring
// uses = ProjetDetailMapper.class - Indique que ce mapper utilise ProjetDetailMapper
// Cela permet de déléguer le mapping des ProjetDetail à ProjetDetailMapper
@Mapper(componentModel = "spring", uses = ClientMapper.class)
public interface CommandeMapper {

    // Mapping de Projet vers ProjetResponse1 avec les détails
    // @Mapping - Spécifie que listDetail dans ProjetResponse1 vient de listDetail dans Projet
    // MapStruct utilise automatiquement ProjetDetailMapper via "uses" pour mapper chaque détail
    @Mapping(target = "listDetail", source = "listDetail")
    CommandeRequest toDto1(Commande commande);

    // Mapping de ProjetRequest vers l'entité Projet
    @Mapping(target = "id", ignore = true) // Ignore l'ID car il est auto-généré

    Commande toEntity(CommandeRequest dto);

    // Mapping simple de Projet vers ProjetResponse
    // MapStruct génère automatiquement le code car les noms de champs correspondent
    CommandeResponse toDto(Commande projet);

}
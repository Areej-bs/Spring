package tn.esprit.spring.tpcafe_areejbensalah.Config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI cafeOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Gestion d'un cafee by Areej ben salah")
                        .description("""
                                <div style='font-family:Segoe UI, sans-serif; line-height:1.6;'>
                                    <h2 style='background: linear-gradient(90deg, #b07a30, #6b4e3d); -webkit-background-clip: text; -webkit-text-fill-color: transparent;'>
                                        ☕ Bienvenue sur <b>TPCafé API</b>
                                    </h2>
                                    <p style='color:#444;'>Découvrez une API complète pour la gestion intelligente d’un café moderne.</p>
                                    <ul style='margin-left:15px; font-size:15px;'>
                                        <li>👤 <b>Gestion des clients</b> — création, mise à jour et fidélisation</li>
                                        <li>📄 <b>Articles</b> — gestion du menu, stocks, et détails produits</li>
                                        <li>🧾 <b>Commandes</b> — suivi complet et détail des achats</li>
                                        <li>🏷️ <b>Promotions</b> — offres exclusives et réductions dynamiques</li>
                                        <li>📍 <b>Adresses</b> — géolocalisation et suivi des clients</li>
                                        <li>💳 <b>Cartes de fidélité</b> — points et récompenses automatiques</li>
                                    </ul>
                                    <hr style='border:none; border-top:1px solid #ddd; margin:20px 0;'>
                                    <div style='font-size:13px; color:#555;'>
                                      
                                   
                                </div>
                                """)

                        .contact(new Contact()
                                .name("BEN SALAH Erij")
                                .email("Erij.BenSalah@esprit.tn")
                                .url("https://www.linkedin.com/in/ben-salah-erij-697b26229/")
                        )
                        .license(new License()
                                .name("📘 Licence — Projet universitaire ESPRIT")
                                .url("https://esprit.tn/")
                        )
                )
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8089/api")
                                .description("🧪 Serveur Local — Développement"),
                        new Server()
                                .url("https://api.tpcafe.tn")
                                .description("🚀 Serveur Distant — Production")
                ))
                .externalDocs(new ExternalDocumentation()
                        .description("📂 Voir le code source sur GitHub")
                        .url("https://github.com/Areej-bs")
                );
    }
}

Résumé du Projet : AdvancedMortgageCalculator (MC)

Description :
Le projet AdvancedMortgageCalculator (MC) est une application complète permettant de calculer les versements mensuels d'un prêt hypothécaire en fonction du prix de la maison, de l'apport initial, de la durée du prêt (en mois) et du taux d'intérêt. L'application est conçue avec une architecture modulaire, utilisant des services distincts pour gérer les taux d'intérêt, les taux d'assurance et les calculs d'amortissement. Elle propose également une interface utilisateur : une interface terminal (TUI) 
Services Principaux :

    InterestRateService (IRS)

        Fonctionnalités :

            Obtenir le taux d'intérêt annuel d'une banque spécifique.

            Trouver la banque offrant le taux d'intérêt le plus bas.

            Lister les banques proposant un type de produit spécifique (prêt hypothécaire, assurance, compte épargne, etc.).

    InsuranceRateService (ACS)

        Fonctionnalités :

            Calculer le taux d'assurance applicable en fonction du montant du prêt et de la durée de remboursement.

    MortgageAmortizationService (MAS)

        Fonctionnalités :

            Calculer le meilleur taux hypothécaire, le montant du versement mensuel et le total des intérêts payés en fonction du prix de la maison, de l'apport initial et de la durée du prêt.

            Ce service communique avec IRS et ACS pour obtenir les taux d'intérêt et d'assurance.
Technologies Utilisées :

    Langage de programmation : Java

    Environnement de développement : IntelliJ IDEA

    Base de données : MariaDB

    ORM : Hibernate

    API de persistance : JPA (Java Persistence API)

    Langage de requête : JPQL (Java Persistence Query Language)

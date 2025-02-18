Résumé du Projet : AdvancedMortgageCalculator (MC)

Description :
Le projet AdvancedMortgageCalculator (MC) est une application qui permet de calculer les versements mensuels d'un prêt hypothécaire en fonction du prix de la maison, de l'apport initial, de la durée du prêt (en mois) et du taux d'intérêt. L'application est divisée en plusieurs services modulaires pour une meilleure gestion des fonctionnalités.
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

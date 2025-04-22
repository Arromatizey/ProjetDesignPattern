Design Patterns Implémentés
1. Factory Method – Création d'interventions
🔹 Objectif du pattern
Permet de créer des objets sans connaître leur classe concrète, en déléguant l’instanciation à une sous-classe.

🔹 Utilisation dans le projet
Une fabrique d’interventions permet de générer dynamiquement différents types d’interventions (maintenance, urgence, etc.) à partir d’un type fourni. Cela facilite l’extension du système à de nouveaux types d’interventions sans modifier le code existant.

2. Decorator – Ajout dynamique de fonctionnalités
🔹 Objectif du pattern
Permet d’enrichir un objet avec de nouvelles fonctionnalités sans modifier sa structure de base.

🔹 Utilisation dans le projet
Des décorateurs comme SuiviGPSDecorator ou PiecesJointesDecorator permettent d’ajouter des comportements supplémentaires aux interventions de façon modulaire, sans altérer leur classe de base. Cela favorise la réutilisabilité et la composition dynamique.

3. Facade – Centralisation et simplification
🔹 Objectif du pattern
Fournit une interface simple et unifiée pour accéder à un sous-système complexe.

🔹 Utilisation dans le projet
La classe GestionnaireInterventions centralise les opérations principales comme la création d’interventions, l’assignation de techniciens et la sauvegarde. Elle masque la complexité interne et propose une interface simple aux utilisateurs ou développeurs.

4. Observer – Notifications internes
🔹 Objectif du pattern
Permet à des objets (observateurs) de s'abonner aux changements d’un autre objet (sujet) et d'être automatiquement notifiés en cas de modification.

🔹 Utilisation dans le projet
Lorsqu'une intervention est créée ou modifiée, des observateurs tels que la console ou un logger fichier sont notifiés automatiquement. Cela permet de séparer la logique métier des mécanismes de notification tout en assurant leur synchronisation.

5. Proxy – Gestion des droits d’accès
🔹 Objectif du pattern
Contrôle l’accès à un objet en interposant un représentant (proxy), souvent pour ajouter un contrôle ou une vérification sans modifier l'objet réel.

🔹 Utilisation dans le projet
Le ProxyGestionnaireInterventions vérifie que le technicien a les droits nécessaires (par exemple, rôle ADMIN) avant d'autoriser certaines actions comme la création ou la modification d'interventions. Cela permet de sécuriser l’accès tout en conservant une interface uniforme.

# Richtlinien für Web-Entwicklung in diesem Projekt

Dieses Projekt ist ein Spring Boot 4 & Thymeleaf Projekt. Wenn du Aufgaben im Bereich Web-Entwicklung ausführst, beachte bitte folgende Punkte:

## Erinnerung an Web-Entwicklung
Sobald du Controller, Templates (Thymeleaf) oder statische Ressourcen (JS/CSS) bearbeitest oder erstellst, erinnere dich an folgende Besonderheiten:
- **Spring Boot 4**: Nutze die neuesten Features und Best Practices von Spring Boot 4.
- **Thymeleaf**: Templates liegen unter `src/main/resources/templates`. Achte auf die korrekte Einbindung von Fragmenten und statischen Ressourcen.
- **Statische Ressourcen**: Diese liegen unter `src/main/resources/static`.
- **Controller**: Achte auf saubere RESTful-Prinzipien oder korrekte View-Mappings.

## Checkliste für Web-Änderungen
1.  Sind die Templates korrekt in `src/main/resources/templates` platziert?
2.  Verwenden die Controller die richtigen `@GetMapping`, `@PostMapping` etc. Annotationen?
3.  Sind die Abhängigkeiten für Web (`spring-boot-starter-webmvc`) und Thymeleaf (`spring-boot-starter-thymeleaf`) in der `pom.xml` vorhanden?
4.  Wurde die Darstellung im Browser (oder durch Integrationstests) verifiziert?

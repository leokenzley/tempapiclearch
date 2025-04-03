# Gerando e Usando um Archetype no Maven

## 📌 Passo 1: Criar um Archetype a partir da sua Aplicação
Você pode transformar sua aplicação em um archetype para reutilização futura.

### 1️⃣ Vá até o diretório raiz da sua aplicação e execute:
```sh
mvn archetype:create-from-project
```
Isso irá gerar um archetype baseado na estrutura do seu projeto.

### 2️⃣ Entre no diretório gerado:
```sh
cd target/generated-sources/archetype
```

### 3️⃣ Instale o archetype no repositório local do Maven:
```sh
mvn install
```

---

## 📌 Passo 2: Criar uma Nova Aplicação Usando o Archetype

Agora, para criar uma nova aplicação baseada no archetype gerado, execute:

```sh
mvn archetype:generate \
  -DarchetypeGroupId=com.seu.grupo \
  -DarchetypeArtifactId=seu-projeto-archetype \
  -DarchetypeVersion=1.0-SNAPSHOT \
  -DgroupId=com.novo.projeto \
  -DartifactId=minha-nova-app \
  -Dversion=1.0.0-SNAPSHOT \
  -DinteractiveMode=false
```

**Substitua:**
- `com.seu.grupo` pelo `groupId` do seu projeto original.
- `seu-projeto-archetype` pelo `artifactId` do archetype gerado.
- `1.0-SNAPSHOT` pela versão do archetype.
- `com.novo.projeto` pelo `groupId` da nova aplicação.
- `minha-nova-app` pelo `artifactId` da nova aplicação.

---

## 📌 Passo 3: Executar a Nova Aplicação
Depois de criada, entre no diretório da nova aplicação e execute:
```sh
cd minha-nova-app
mvn spring-boot:run
```

---

## 🔥 Dica Extra:
Se quiser listar os archetypes disponíveis, use:
```sh
mvn archetype:generate -DarchetypeCatalog=local
```

Isso ajuda a verificar se o seu archetype foi instalado corretamente.

Agora você pode facilmente reutilizar essa estrutura sempre que precisar criar um novo projeto! 🚀


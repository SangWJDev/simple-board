# 🛠 Trouble Shooting Log

문제 해결 과정을 기록하여 유사한 문제 발생 시 빠르게 대응할 수 있도록 합니다.  
작성 시에는 발생 원인, 해결 과정, 결과 등을 명확하게 남겨주세요.

---

## ❗️[문제 제목 예: Spring Boot에서 DB 연결 오류 발생]

- **발생일**: 2024-04-30
- **발생 환경**: macOS / Docker / IntelliJ / Spring Boot 3.2
- **관련 파일**: `application.yml`, `docker-compose.yaml`
- **에러 로그 요약**:

---

## ❗️[문제 제목: db 스키마와 Entity 맵핑 오류] 

- **발생일**: 2024-04-30
- **발생 환경**: macOS / Docker / IntelliJ / Spring Boot 3.2
- **관련 파일**: `reply.db.replyEntity`
- **에러 로그 요약**: mysql에서 reply table 작성된 스키마와 다른 컬럼이 들어가서 발생한 에러
```
  Caused by: jakarta.persistence.PersistenceException: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.tool.schema.spi.SchemaManagementException: Schema-validation: missing column [status] in table [reply]
```
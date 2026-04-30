# ManageR UML Prompt

Use this prompt to generate a UML diagram for the ManageR project:

```text
You are a software architect and UML specialist.

Analyze the ManageR project and generate UML diagrams that accurately describe its structure and behavior.

Project context:
- Backend: Spring Boot REST API with layered architecture
- Frontend: React + Redux + Vite application
- Main domain areas: users, projects, issues, comments, chat, invitations, subscriptions, authentication, and payments

Requirements:
- First, identify the most appropriate UML diagram type or types for the request. Prefer class diagrams for domain structure, component diagrams for frontend/backend architecture, and sequence diagrams for user flows.
- If the request is broad, create the most useful diagram first and briefly mention any additional diagram types that would also help.
- Capture the major backend layers: controller, service, repository, model/entity, and config.
- Capture the major frontend layers: pages, components, Redux store, reducers, and API calls.
- Include the important domain entities and relationships such as User, Project, Issue, Comment, Chat, Invitation, Subscription, and Payment when relevant.
- Show associations, inheritance, multiplicities, dependencies, and data flow where applicable.
- Keep the diagram readable and focused on the core project structure rather than every implementation detail.
- Output the diagram in Mermaid syntax unless another format is explicitly requested.
- After the diagram, add a short explanation of the main relationships and why the chosen diagram type fits the ManageR project.

If the user provides code or a feature request, tailor the diagram to that specific part of the project.

Input:
[Paste the relevant ManageR code, feature, or system description here]

Optional preferences:
- Diagram type: [class / use case / sequence / component / deployment / activity]
- Scope: [entire project / backend / frontend / feature-specific]
- Level of detail: [high / medium / low]
```

# Cover Page

**A Final Year B.Tech Project Report**

**Title:** ManageR - Web-Based Project and Issue Management System with Team Collaboration and Subscription Management  
**Submitted in partial fulfillment of the requirements for the degree of**  
**Bachelor of Technology (B.Tech)**

**Department:** Computer Science and Engineering  
**Academic Session:** 2025-2026

**Submitted By:**

- Name: ********\_\_\_\_********
- Roll No.: ********\_\_\_\_********
- Registration No.: ********\_\_\_\_********

**Under the Guidance of:**

- Guide Name: ********\_\_\_\_********
- Designation: ********\_\_\_\_********

**Institution:** ********\_\_\_\_********  
**University:** ********\_\_\_\_********

---

# Preliminary Sections

## Approval Page

This project report titled **"ManageR - Web-Based Project and Issue Management System with Team Collaboration and Subscription Management"** submitted by ********\_\_\_\_******** is approved as a partial fulfillment for the award of the degree of Bachelor of Technology in Computer Science and Engineering.

**Project Guide:** ********\_\_\_\_********  
**Head of Department:** ********\_\_\_\_********  
**External Examiner:** ********\_\_\_\_********  
**Date:** ********\_\_\_\_********

## Declaration

I hereby declare that the project report entitled **"ManageR - Web-Based Project and Issue Management System with Team Collaboration and Subscription Management"** is an original work carried out by me/us under the supervision of ********\_\_\_\_********. This report has not been submitted, in part or full, for the award of any other degree or diploma at any institution.

**Student Signature:** ********\_\_\_\_********  
**Name:** ********\_\_\_\_********  
**Date:** ********\_\_\_\_********

## Certificate

This is to certify that the project work entitled **"ManageR - Web-Based Project and Issue Management System with Team Collaboration and Subscription Management"** has been carried out by ********\_\_\_\_******** under my supervision during the academic session 2025-2026. The work is found satisfactory for submission in partial fulfillment of the degree of Bachelor of Technology.

**Project Guide Signature:** ********\_\_\_\_********  
**Name:** ********\_\_\_\_********  
**Designation:** ********\_\_\_\_********  
**Department:** ********\_\_\_\_********

## Acknowledgement

The successful completion of this project would not have been possible without the support and guidance of several individuals and organizations. I/We express sincere gratitude to our project guide for technical direction, regular reviews, and constructive feedback throughout the project lifecycle.

I/We thank the Head of Department and faculty members for providing institutional support and academic resources. I/We also acknowledge peers and team members who contributed through discussions, testing, and validation activities.

Finally, I/We are deeply grateful to our family for continuous encouragement and motivation during the execution of this work.

## Abstract

This report presents **ManageR**, a full-stack web platform designed to streamline project management, issue tracking, team communication, and subscription handling in a unified environment. The system is built using a modern frontend stack (React, Redux, Vite, Tailwind-based UI components) and a robust backend stack (Spring Boot, JWT security, MySQL, RESTful APIs, and WebSocket-ready chat routes).

The proposed system addresses typical challenges in student and small-team project coordination, including fragmented communication, unstructured issue management, weak access control, and lack of transparent progress tracking. ManageR provides secure authentication, project creation and collaboration workflows, issue lifecycle management, comment threads, and role-oriented access behavior. Additionally, it integrates a subscription and payment workflow with external payment link generation.

The implementation follows modular design principles and feature-wise separation, improving maintainability and extensibility. Experimental validation through functional, integration, and user-flow testing indicates that the system fulfills major requirements for correctness, usability, and response consistency under expected usage conditions.

The project demonstrates that combining structured backend domain modeling with responsive frontend state management can produce an effective, scalable foundation for real-world collaborative project management applications.

**Keywords:** project management, issue tracking, Spring Boot, React, JWT authentication, team collaboration, subscription workflow, software architecture.

---

# Table Sections

## Table of Contents

1. Cover Page
2. Preliminary Sections
3. Table Sections
4. Chapter 1: Introduction
5. Chapter 2: System Architecture and Technologies
6. Chapter 3: Methodology
7. Chapter 4: Implementation
8. Chapter 5: Results and Discussion
9. Chapter 6: Conclusion
10. Chapter 7: Future Scope
11. Appendix
12. Bibliography

## List of Figures

- Figure 2.1: High-Level System Architecture
- Figure 2.2: Authentication and Authorization Flow
- Figure 2.3: Project-Issue-Comment Interaction Model
- Figure 3.1: Phase-wise Development Methodology
- Figure 3.2: Issue Lifecycle State Transition
- Figure 4.1: Frontend Module Organization
- Figure 4.2: Backend API and Service Layers
- Figure 5.1: End-to-End User Journey Validation

## List of Tables

- Table 2.1: Technology Stack and Rationale
- Table 3.1: Core Algorithm Summary
- Table 4.1: Backend Endpoints by Module
- Table 5.1: Testing Matrix
- Table 5.2: Representative Performance Observations
- Table 7.1: Proposed Future Enhancements

## List of Abbreviations

- API: Application Programming Interface
- JWT: JSON Web Token
- UI: User Interface
- UX: User Experience
- REST: Representational State Transfer
- STOMP: Simple Text Oriented Messaging Protocol
- RBAC: Role-Based Access Control
- CRUD: Create, Read, Update, Delete
- DBMS: Database Management System
- ORM: Object-Relational Mapping

## List of Symbols

- $N$: Number of active users
- $P$: Number of projects
- $I$: Number of issues
- $C$: Number of comments
- $t_r$: API response time
- $S$: System throughput (requests per second)

---

# Chapter 1: Introduction

## 1.1 Introduction

Digital project execution environments require synchronized management of tasks, communication, and accountability across team members. Conventional methods, such as informal messaging and disconnected spreadsheets, fail to provide consistency, traceability, and role-aware control. The need for an integrated software platform is particularly significant for student teams, startups, and small organizations where productivity and transparency are constrained by limited process tooling.

ManageR is designed as a unified project management platform combining project planning, issue tracking, team participation, contextual chat, and subscription-enabled service delivery. It enables users to create projects, invite collaborators, assign and update issues, discuss updates, and manage account plans through a common interface.

## 1.2 Literature Review

Existing platforms such as Trello, Jira, Asana, and ClickUp provide mature task management features. However, they often present one or more limitations for smaller deployments:

1. High configuration complexity for beginner teams.
2. Pricing tiers that restrict core collaboration features.
3. Limited customization for academic or project-specific workflows.
4. Dependency on external communication channels beyond the task context.

Research and industry practices in collaborative systems indicate that effective tools must combine secure identity management, structured issue state transitions, and contextual communication for decision traceability. ManageR draws from these findings by integrating issue workflows, comments, and chat within project scope while keeping architecture modular and implementation maintainable.

## 1.3 Problem Statement

Team-based projects often suffer from:

1. Scattered task information across multiple tools.
2. Inconsistent responsibility allocation and issue ownership.
3. Lack of role-sensitive data access and operation control.
4. Poor auditability of progress and communication history.
5. Difficulty in scaling a simple collaboration tool into a subscription-ready product.

The problem is to build a secure and scalable web application that consolidates project, issue, communication, and subscription processes with a user-friendly interface and maintainable backend architecture.

## 1.4 Objectives

The primary objectives of ManageR are:

1. Implement secure user authentication and profile access using token-based mechanisms.
2. Provide full project lifecycle management including creation, update, deletion, search, and filtering.
3. Enable complete issue lifecycle management with assignment, status transitions, and prioritization.
4. Integrate issue comments and project chat for communication continuity.
5. Support subscription plans and payment initiation workflow.
6. Maintain modular, testable, and extensible code organization across frontend and backend.

## 1.5 Significance of the Project

ManageR is significant in both academic and practical contexts:

1. Demonstrates full-stack engineering with real-world architecture patterns.
2. Validates secure API design using authentication middleware and route-level protection.
3. Provides a reusable framework for educational and startup project teams.
4. Bridges technical implementation and productization through subscription integration.
5. Encourages disciplined engineering practices such as modularity, layered design, and testability.

## 1.6 Chapter Scheme

The remainder of this report is structured as follows:

1. Chapter 2 describes architecture, technology selection, and component relationships.
2. Chapter 3 presents methodology, algorithms, and data flow design.
3. Chapter 4 details implementation decisions and module-level realization.
4. Chapter 5 analyzes testing outcomes and performance observations.
5. Chapter 6 summarizes contributions and concludes findings.
6. Chapter 7 outlines future enhancement directions.

## 1.7 Scope of the Work

The current implementation scope focuses on the complete lifecycle of collaborative project execution in a web environment. The platform supports identity management, project operations, issue workflows, discussion mechanisms, and subscription transitions. The deployed feature boundary intentionally emphasizes robustness of core collaboration functions instead of broad but shallow feature inclusion.

The in-scope capabilities include:

1. Multi-user access with authenticated sessions.
2. Project-level ownership and participant collaboration.
3. CRUD operations for issues and contextual comments.
4. Chat-enabled communication within project context.
5. Subscription and payment initiation workflow.

Out-of-scope capabilities for this phase include enterprise-grade SLA dashboards, advanced reporting pipelines, and multi-tenant organization-level billing controls.

## 1.8 Assumptions and Constraints

The design is based on the following assumptions:

1. Users possess basic understanding of web-based project tools.
2. Internet connectivity is available for client-server communication.
3. External payment gateway remains reachable during upgrade actions.

Operational constraints considered during implementation:

1. Time-bounded academic development cycle.
2. Limited cloud-scale performance benchmarking setup.
3. Need for maintainable modular code by student team members.

## 1.9 Expected Contributions

This project contributes at three levels:

1. **Engineering Contribution:** a fully functional and modular full-stack system with practical security and domain modeling.
2. **Process Contribution:** a replicable feature-wise implementation approach for student projects.
3. **Application Contribution:** a usable collaboration platform for small teams requiring integrated workflow management.

## 1.10 Research Gap Analysis

Despite the availability of established task management software, a visible gap exists in platforms tailored to small, rapidly formed teams that require both technical rigor and minimal onboarding complexity. Most heavyweight systems provide broad feature sets but often impose steep configuration overhead and complex permission structures that are not ideal for student-led and early-stage product teams.

ManageR addresses this gap by focusing on:

1. Lightweight onboarding with immediate project and issue operations.
2. Contextual collaboration through issue comments and project chat under one data model.
3. Progressive growth path from free-tier usage to subscription-based expansion.

This focused scope enables higher practical adoption in educational and prototype-to-product environments.

## 1.11 Requirement Classification

The requirements can be grouped into functional and non-functional dimensions for implementation traceability.

### 1.11.1 Functional Requirement Groups

1. User registration, authentication, and profile retrieval.
2. Project CRUD, search, filtering, invitation, and invitation acceptance.
3. Issue lifecycle operations with assignment and status transitions.
4. Comment creation/retrieval/deletion and project-level chat interactions.
5. Subscription retrieval, upgrade initiation, and payment callback alignment.

### 1.11.2 Non-Functional Requirement Groups

1. Security through JWT-based protected APIs and secure credential handling.
2. Maintainability through modular frontend-backend feature boundaries.
3. Usability through structured forms and predictable navigation behavior.
4. Reliability through deterministic API responses and validation logic.
5. Extensibility through layered architecture and service abstraction.

---

# Chapter 2: System Architecture and Technologies

## 2.1 Technology Stack

### 2.1.1 Frontend

- React for component-driven interface development.
- Redux for centralized predictable state management.
- Vite for high-performance development and optimized builds.
- Tailwind-compatible component libraries for reusable UI elements.
- Axios-based API communication abstraction.

### 2.1.2 Backend

- Spring Boot for rapid development of RESTful services.
- Spring Security + JWT for authentication and authorization.
- MySQL for relational data persistence.
- JPA/Hibernate for ORM-based entity management.
- WebSocket/STOMP-ready routes for chat extensibility.

### 2.1.3 External Services

- Payment link generation through Razorpay integration flow.

## 2.2 Architecture Overview

ManageR follows a client-server architecture with clear separation of concerns:

1. Presentation Layer (React): Handles user interaction and rendering.
2. State and API Layer (Redux + service calls): Manages application state and API orchestration.
3. Service Layer (Spring Boot services): Contains business rules and domain logic.
4. Data Access Layer (Repositories): Performs database interactions.
5. Persistence Layer (MySQL): Stores domain entities and relationships.

Security is implemented through stateless authentication using JWT. The frontend attaches bearer tokens in authorized requests, and backend filters validate token integrity before granting access to protected resources.

## 2.3 Components

### 2.3.1 Authentication Component

- Sign-up and sign-in endpoints.
- JWT issuance and profile retrieval.
- Frontend session persistence and controlled logout.

### 2.3.2 Project Management Component

- CRUD operations for projects.
- Search and filtering support.
- Invitation generation and acceptance workflow.

### 2.3.3 Issue Management Component

- Creation and update of issue artifacts.
- Assignee mapping and status transitions.
- Issue retrieval by ID or project scope.

### 2.3.4 Comment and Chat Component

- Contextual comments attached to issues.
- Project-specific message exchange.
- Chat history retrieval and extensible realtime route support.

### 2.3.5 Subscription Component

- Default free-plan provisioning.
- Upgrade path to monthly and annual plans.
- Payment callback-driven subscription update logic.

## 2.4 Workflow

The main workflow is summarized below:

1. User registers or logs in and receives a JWT.
2. Authenticated user creates or joins a project.
3. User creates issues and assigns responsibilities.
4. Team members update statuses and discuss through comments/chat.
5. User initiates subscription upgrade and is redirected to payment flow.
6. Payment success updates subscription state and feature access.

## 2.5 Detailed Layered Architecture

The software is organized through a layered architecture that isolates responsibilities and improves maintainability:

1. **Presentation Layer:** React pages and reusable components collect input and render server state.
2. **Application State Layer:** Redux reducers and asynchronous action creators orchestrate view updates and API calls.
3. **API Controller Layer:** Spring Boot controllers expose REST endpoints and perform request validation.
4. **Business Service Layer:** Service classes enforce project rules, authorization conditions, and transition logic.
5. **Repository Layer:** JPA repositories map domain operations to SQL-level persistence.
6. **Database Layer:** MySQL tables hold transactional and reference data with relational constraints.

This architecture minimizes direct coupling between UI and persistence by forcing all critical operations through service-level invariants.

## 2.6 Security Architecture

Security is treated as a cross-cutting concern through token-based stateless authentication:

1. Credentials are validated against stored user records.
2. Passwords are hashed before persistence and never stored in plaintext.
3. JWT tokens carry user identity claims and expiry metadata.
4. Protected endpoints are intercepted by security filters.
5. Access is granted only when token validity and permission rules are satisfied.

Security hardening considerations for production deployment:

1. Short-lived access tokens with refresh token rotation.
2. Environment-based secret management instead of hardcoded configuration.
3. Request rate limiting and brute-force login protection.
4. Structured audit logging for sensitive operations.

## 2.7 Database Design Overview

The entity model follows normalized relational mapping to reduce redundancy and preserve consistency. Representative relationships include:

1. One-to-many mapping between User and Project ownership.
2. Many-to-many project team participation through association logic.
3. One-to-many mapping between Project and Issue.
4. One-to-many mapping between Issue and Comment.
5. One-to-one or one-to-many subscription linkage per user (depending on history tracking design).

Indexing strategy should prioritize foreign keys and frequently queried columns (projectId, issueId, assigneeId, createdAt) to maintain acceptable response time under growth.

## 2.8 Deployment View

A standard deployment topology for this system consists of:

1. Frontend static bundle served through a web server or CDN.
2. Backend service deployed as a Spring Boot runtime process.
3. MySQL server hosted locally or in managed cloud infrastructure.
4. Payment provider integration through secure HTTPS callbacks.

This arrangement enables independent scaling and versioning of frontend and backend components.

## 2.9 Component Interaction and Communication Contracts

Component interactions are defined through explicit request-response contracts and data ownership boundaries:

1. **Auth to User Context:** authentication service issues token; frontend resolves user profile and initializes session state.
2. **Project to Issue Context:** issue service validates project association before read/write operations.
3. **Issue to Comment Context:** comments are strictly scoped to issue identifiers with ownership checks for deletion.
4. **Subscription to Payment Context:** plan selection maps to payment link generation and asynchronous callback handling.

This contract-oriented approach prevents accidental cross-module coupling and improves versioned API evolution.

## 2.10 Applied Design Patterns

The implementation reflects practical use of software design patterns:

1. **Layered Pattern:** clear separation across controller, service, and repository tiers.
2. **Repository Pattern:** encapsulated data access abstraction through JPA repositories.
3. **DTO-like Transfer Strategy:** payload-specific request/response structures to avoid direct entity overexposure.
4. **State Representation Pattern:** issue progress modeled using explicit status states.

These patterns collectively reduce maintenance complexity and increase testability.

## 2.11 Technology Selection Rationale (Extended)

Technology choices were made against educational feasibility and production relevance criteria:

1. React + Redux enables predictable and debuggable state transitions for dynamic collaboration screens.
2. Spring Boot accelerates robust API development with mature ecosystem support.
3. MySQL provides dependable relational consistency for project-issue-comment hierarchies.
4. JWT-based auth provides scalable stateless session management in distributed environments.
5. Vite improves development throughput through fast build and hot reload performance.

---

# Chapter 3: Methodology

## 3.1 Phase-wise System Design

The development process follows an incremental phase-wise methodology:

### Phase 1: Requirement Engineering

- Analyze feature requirements from collaborative project lifecycle.
- Define functional and non-functional constraints.
- Identify security and role behavior expectations.

### Phase 2: Domain Modeling

- Define entities: User, Project, Issue, Comment, Chat, Message, Subscription, Invitation, PasswordResetToken.
- Establish relationships and key constraints.

### Phase 3: API and Service Design

- Prepare REST contracts for each feature group.
- Implement service-layer validation and access checks.
- Standardize error responses and success payloads.

### Phase 4: Frontend Integration

- Build reusable components and route-level pages.
- Integrate asynchronous API actions with Redux state transitions.
- Add forms, validation, and user feedback flows.

### Phase 5: Testing and Refinement

- Execute module-level and end-to-end test scenarios.
- Validate authorization boundaries and error handling.
- Tune API and UI interactions for smooth user flow.

## 3.2 Algorithms

The system uses practical workflow algorithms for core operations.

### 3.2.1 JWT Authentication Validation Algorithm

1. Accept login/signup credentials.
2. Validate user identity.
3. Generate signed JWT token with expiry.
4. Attach token in response.
5. For each protected request, verify token signature and claims.
6. Authorize operation based on authenticated principal and resource policy.

### 3.2.2 Issue Assignment Algorithm

1. Receive issue ID and target user ID.
2. Verify issue existence and project membership.
3. Verify assigner permission within project.
4. Update issue assignee field.
5. Persist state and return updated issue payload.

### 3.2.3 Project Search and Filter Algorithm

1. Accept keyword, category, and tag parameters.
2. Build query predicates dynamically.
3. Retrieve matched projects from repository.
4. Return list ordered by relevance/time (as configured).

### 3.2.4 Subscription Upgrade Flow Algorithm

1. Receive selected plan type.
2. Validate user and current subscription.
3. Generate payment link using payment provider integration.
4. Redirect client to payment page.
5. On successful callback, upgrade plan and update validity period.

## 3.3 Data Flow

### 3.3.1 User-Centric Data Flow

- Input: user action from UI.
- Processing: frontend validation, API dispatch, backend rule enforcement.
- Output: persisted data and UI state update.

### 3.3.2 Issue Lifecycle Data Flow

- Creation: issue metadata stored with project linkage.
- Progress: status and assignee updates tracked over time.
- Collaboration: comments and chat messages linked by context.
- Completion: issue marked done and remains queryable for history.

### 3.3.3 Security Data Flow

- Authentication token generated at sign-in.
- Token attached in authorization header for protected routes.
- Security filter validates token before service invocation.

## 3.4 UML-Oriented Design Interpretation

Although implementation is code-first, the system aligns with standard UML viewpoints:

1. **Use Case View:** guest registration/login, authenticated project management, issue collaboration, subscription upgrade.
2. **Class View:** entity classes for user, project, issue, comment, chat, message, subscription, and invitation tokens.
3. **Sequence View:** request traverses controller -> service -> repository -> database and returns response payload.
4. **State View:** issue states transition across todo, in_progress, and done.

## 3.5 Pseudocode for Core Operations

### 3.5.1 Issue Status Transition

```text
function updateIssueStatus(issueId, newStatus, currentUser):
	issue = issueRepository.findById(issueId)
	if issue is null:
		return NOT_FOUND

	if not hasProjectAccess(currentUser, issue.projectId):
		return FORBIDDEN

	if not isValidTransition(issue.status, newStatus):
		return BAD_REQUEST

	issue.status = newStatus
	issue.updatedAt = now()
	issueRepository.save(issue)
	return OK(issue)
```

### 3.5.2 Invitation Acceptance

```text
function acceptInvitation(token, currentUser):
	invitation = invitationRepository.findByToken(token)
	if invitation is null or invitation.isExpired():
		return INVALID_TOKEN

	if invitation.email != currentUser.email:
		return EMAIL_MISMATCH

	addUserToProject(currentUser.id, invitation.projectId)
	invitation.markAccepted()
	invitationRepository.save(invitation)
	return SUCCESS
```

## 3.6 Complexity Considerations

For representative operations, complexity can be interpreted as:

1. Project retrieval by indexed identifier: approximately $O(1)$ average at application query level.
2. Filtered search with multiple predicates: approximately $O(k + r)$ where $k$ is predicate construction cost and $r$ is returned rows under indexed conditions.
3. Issue comment fetch by issueId: approximately $O(r)$ where $r$ is number of comments mapped to selected issue.

Actual runtime characteristics depend heavily on database indexing, query planner behavior, and payload size.

## 3.7 Error Handling Methodology

The backend error strategy emphasizes deterministic response envelopes:

1. Input validation errors return client-consumable messages.
2. Authentication and authorization failures return explicit status codes.
3. Business-rule violations (invalid transitions, duplicate operations) are surfaced with contextual detail.
4. Unexpected exceptions are logged with trace IDs for maintainability.

This improves frontend resilience and simplifies debugging of distributed request flows.

## 3.8 Development Process and Iteration Strategy

The implementation followed a milestone-driven iterative strategy where each milestone delivered a vertical slice of functionality from UI to database.

### 3.8.1 Iteration 1: Authentication Baseline

1. Implement signup/signin.
2. Establish token issuance and protected route testing.
3. Validate profile retrieval and logout behavior.

### 3.8.2 Iteration 2: Project and Invitation Core

1. Build project CRUD and list/search flows.
2. Introduce invitation token generation and acceptance workflow.
3. Validate owner/member access boundaries.

### 3.8.3 Iteration 3: Issue and Comment Lifecycle

1. Add issue CRUD, status transitions, and assignment endpoints.
2. Integrate issue comments for contextual discussion.
3. Validate state consistency across UI refresh and navigation paths.

### 3.8.4 Iteration 4: Subscription Integration

1. Integrate plan retrieval and upgrade path.
2. Add payment link generation flow.
3. Validate callback-driven subscription updates.

## 3.9 Data Validation Rules

Validation policies were enforced at multiple boundaries:

1. **Input-level validation:** required fields, valid email formats, and bounded text lengths.
2. **Business-level validation:** project membership checks before issue/comment operations.
3. **Transition-level validation:** only legal issue status changes are accepted.
4. **Security-level validation:** endpoint access blocked without valid token and user context.

## 3.10 Traceability Matrix Snapshot

Representative mapping of requirements to implementation modules:

1. Secure login requirement -> Auth controller/service + JWT filter + frontend auth state slice.
2. Issue assignment requirement -> Issue service + assignment endpoint + issue details UI actions.
3. Invitation acceptance requirement -> Project invitation service + token route + member join update.
4. Subscription upgrade requirement -> Subscription/payment endpoints + plan selection page.

This traceability mapping supports maintenance, review, and academic evaluation.

---

# Chapter 4: Implementation

## 4.1 Project Structure

The project is divided into frontend and backend workspaces.

### Frontend Structure (React + Redux)

1. API abstraction layer for HTTP interactions.
2. Reusable UI component library.
3. Feature pages for Auth, Home, Issue, Project, Subscription, and Navigation.
4. Redux slices grouped by domain modules such as Auth, Project, Issue, Comment, Chat, Payment, and Subscription.

### Backend Structure (Spring Boot)

1. Controller layer for endpoint definitions.
2. Service layer for business logic.
3. Repository layer for persistence operations.
4. Entity model for relational schema mapping.
5. Security configuration for JWT-protected routes.

## 4.2 Modules

### 4.2.1 Authentication Module

- Endpoints for signup/signin and profile retrieval.
- Password handling with secure hashing.
- Token generation and stateless session pattern.

### 4.2.2 Project Module

- Create, update, delete, list, search, and invite operations.
- Invitation acceptance workflow with token resolution.

### 4.2.3 Issue Module

- Issue CRUD operations and project-level query support.
- Assignee and status updates through explicit endpoints.

### 4.2.4 Comment Module

- Comment creation and retrieval per issue.
- Controlled deletion based on ownership/service rules.

### 4.2.5 Chat Module

- Message send endpoint and chat history retrieval.
- Realtime-ready route design for future WebSocket enhancement.

### 4.2.6 Subscription and Payment Module

- User subscription query and plan upgrade endpoint.
- Payment link generation and callback processing.

## 4.3 Core Logic

Key implementation logic includes:

1. Domain-level validation before write operations.
2. Access checks to prevent unauthorized modifications.
3. Structured API response generation for frontend consistency.
4. Centralized state handling in frontend to reduce UI-side data drift.
5. Feature-wise modularization to isolate concerns and support extension.

## 4.4 Screens and Outputs

Representative user-facing screens include:

1. Authentication screen for signup/signin.
2. Project listing and project details views.
3. Issue board/list view with status controls.
4. Issue details page with comments.
5. Project chat box for team communication.
6. Subscription page with plan options and upgrade actions.

Sample output behavior:

- Successful login returns JWT and profile context.
- Project creation updates project list without full page reload.
- Issue status update reflects immediately in relevant view.
- Upgrade initiation returns redirectable payment URL.

## 4.5 Frontend Implementation Details

The frontend implementation follows component composability and predictable state transitions:

1. UI components are modularized into common controls and feature pages.
2. Route-driven page loading separates public and protected views.
3. API calls are abstracted to reduce repeated request boilerplate.
4. Redux slices encapsulate domain states such as auth, project, issue, comment, and subscription.

Key design rationale:

1. Reduced prop drilling through centralized store architecture.
2. Easier debugging via explicit action-driven updates.
3. Improved testability of reducers and asynchronous flows.

## 4.6 Backend Implementation Details

Backend implementation enforces clean separation between transport and business rules:

1. Controllers remain thin and delegate logic to services.
2. Services perform validation, permission checks, and transition rules.
3. Repositories persist and query entities through JPA abstractions.
4. Security filters handle authentication prior to business execution.

This separation ensures that domain logic is reusable and not entangled with HTTP handling concerns.

## 4.7 Request-Response Lifecycle Illustration

A typical protected operation (issue update) follows these steps:

1. User action on UI dispatches update request.
2. API client attaches authorization header.
3. Backend security filter validates token.
4. Controller maps request body and invokes service.
5. Service validates project membership and operation legality.
6. Repository persists changes in database.
7. Success response returns updated entity.
8. Redux state updates and UI re-renders affected view.

## 4.8 Representative Screens with Technical Interpretation

1. **Authentication Screen:** validates credential patterns before network request dispatch.
2. **Project Dashboard:** merges search/filter state with paginated-style list rendering (logical pagination support can be integrated later).
3. **Issue Detail View:** fetches issue metadata and associated comments in contextual sequence.
4. **Subscription View:** presents plan features and initiates secure external payment route.

These screens collectively demonstrate high cohesion between UI intent and backend endpoint design.

## 4.9 Configuration and Environment Notes

To align with production-ready practices, the following configuration strategy is recommended:

1. Use environment variables for JWT secrets, DB credentials, and payment keys.
2. Separate development and production profiles in backend configuration.
3. Maintain frontend environment files for API base URLs and non-sensitive runtime flags.
4. Introduce configuration validation at startup for fail-fast behavior.

## 4.10 Module-Wise Implementation Walkthrough

### 4.10.1 Authentication Walkthrough

1. User submits credentials through auth forms.
2. Frontend dispatches auth action and calls backend endpoint.
3. Backend validates credentials and returns token payload.
4. Frontend stores token context and enables protected routes.

### 4.10.2 Project Walkthrough

1. Create project form captures structured metadata (name, description, category, tags).
2. Backend persists project with owner linkage.
3. Project list refreshes using centralized state updates.
4. Invitation workflow connects email-based token issuance and acceptance route.

### 4.10.3 Issue Walkthrough

1. Issue creation links task metadata to a project identifier.
2. Assignment endpoint binds issue to selected project member.
3. Status endpoint updates task progress state.
4. UI reflects changed issue cards/details without full page reload.

### 4.10.4 Subscription Walkthrough

1. User views current plan in subscription page.
2. Upgrade action requests payment link from backend.
3. User is redirected to payment provider page.
4. Success callback updates plan state and validity window.

## 4.11 Backend Transaction and Consistency Notes

Critical operations are expected to run with transactional safety, especially where multiple entity updates occur (for example invitation acceptance and membership update). This prevents partial updates and ensures atomic behavior in collaborative operations.

Consistency safeguards include:

1. Foreign key constraints between project, issue, comment, and user entities.
2. Service-level checks to avoid invalid cross-project associations.
3. Controlled update endpoints to preserve business-rule invariants.

## 4.12 Error Response and UI Feedback Integration

The frontend consumes backend status and message payloads to present user-centric feedback states:

1. Success alerts for create/update operations.
2. Inline validation hints for malformed input.
3. Permission-related warnings for forbidden actions.
4. Retry-friendly messages for recoverable API failures.

This alignment improves usability and reduces operational ambiguity for end users.

---

# Chapter 5: Results and Discussion

## 5.1 Testing

Testing was conducted at three levels:

1. Functional testing of each module endpoint and UI action.
2. Integration testing of frontend-backend workflows.
3. Scenario-based testing for real user journeys.

### 5.1.1 Functional Test Coverage Highlights

- Auth: signup, signin, profile retrieval, invalid credential handling.
- Projects: CRUD, search, filter, invite, and invitation acceptance.
- Issues: creation, assignment, status transitions, deletion.
- Comments: add/list/delete behavior with ownership checks.
- Subscription: plan query, upgrade initiation, callback update path.

## 5.2 Metrics

Representative metrics observed in development and controlled test setup:

- Average authenticated API response latency remained within acceptable interactive range for standard CRUD requests.
- End-to-end action completion (UI submit to reflected state) was consistent for common operations.
- No data integrity inconsistency observed in core relational mappings during repeated create-update-delete cycles.

A simple response time model can be represented as:

$$
t_r = t_{network} + t_{server} + t_{db}
$$

where each component remained bounded under expected local testing load.

## 5.3 Performance Discussion

1. The architecture handled typical collaborative usage patterns effectively.
2. Stateless token authentication improved horizontal scalability potential.
3. Feature-wise modular code organization reduced complexity during debugging and enhancement.
4. The current absence of backend pagination may affect performance at very large data volumes and should be addressed in future revisions.

## 5.4 Detailed Testing Matrix

| Test Category | Scenario | Expected Result | Observation |
| --- | --- | --- | --- |
| Authentication | Valid signup and signin | Token issued and profile accessible | Passed |
| Authentication | Invalid password login | Access denied with proper error | Passed |
| Projects | Create project with valid payload | Project persisted and visible in list | Passed |
| Projects | Invite member with email | Invitation generated and accepted via token | Passed |
| Issues | Update issue status todo -> in_progress -> done | Status transition stored consistently | Passed |
| Issues | Assign issue to non-member | Operation rejected | Passed |
| Comments | Delete own comment | Comment removed successfully | Passed |
| Comments | Delete other user comment | Permission denied as per service rule | Passed |
| Subscription | Upgrade free to monthly | Payment link generated and redirect provided | Passed |
| Subscription | Callback updates subscription | Plan state updated in user profile | Passed |

## 5.5 Discussion on Reliability and Maintainability

Reliability indicators observed:

1. Deterministic API behavior for valid and invalid inputs.
2. Stable state synchronization between frontend and backend for core operations.
3. No observed orphan references in standard create-update-delete operation cycles.

Maintainability indicators observed:

1. Domain-wise code grouping reduces cross-feature interference.
2. Layered architecture enables isolated refactoring.
3. Predictable endpoint naming improves developer onboarding.

## 5.6 Limitations of Current Evaluation

While functional outcomes are satisfactory, evaluation has known limitations:

1. Benchmarks were not conducted under high-concurrency production traffic.
2. Automated test coverage can be expanded further for regression resilience.
3. Security testing depth can be increased with dedicated penetration tooling.

## 5.7 Comparative Reflection

Compared to ad-hoc task coordination methods, ManageR shows superior traceability through structured issue states and comment history. Compared to enterprise suites, it provides a lighter workflow with lower configuration overhead, making it suitable for academic and small-team contexts.

## 5.8 Benchmarking Approach (Academic Testbed)

A controlled academic benchmarking approach was used to assess operational responsiveness:

1. Repeated CRUD requests for projects and issues.
2. Sequential status updates simulating sprint board movement.
3. Concurrent comment creation under shared issue context.

Observed system behavior remained stable under moderate workload, with no critical functional regressions during repeated execution cycles.

## 5.9 Security and Robustness Discussion

From a security posture perspective, the current implementation demonstrates baseline robustness through token-based access control and bounded endpoint exposure. However, advanced hardening for production should include:

1. Rotating secrets and stronger key lifecycle governance.
2. API-level throttling against credential stuffing and abuse.
3. Structured monitoring and alerting for anomalous access patterns.
4. Extended dependency vulnerability scanning within CI pipelines.

## 5.10 Interpretation of Outcomes

The observed results indicate that system quality is acceptable for its target usage profile:

1. Functional correctness for primary collaboration flows is consistently achieved.
2. User interaction latency remains suitable for routine team operations.
3. Architecture choices support maintainable growth and future feature expansion.

Therefore, the implementation is technically sound for academic demonstration and pilot real-world usage.

---

# Chapter 6: Conclusion

## 6.1 Summary

This project developed and validated a comprehensive collaborative management system integrating secure authentication, project lifecycle operations, issue tracking, communication, and subscription workflows. The system aligns with modern full-stack software engineering practices and demonstrates practical deployment-ready architecture patterns.

## 6.2 Achievements

1. Delivered a full-stack application with modular frontend and backend design.
2. Implemented secure JWT-based protected route architecture.
3. Achieved functional coverage for project, issue, comment, chat, and subscription modules.
4. Established extensible structure for future realtime and analytics capabilities.
5. Produced clear API boundaries and maintainable component hierarchy.

## 6.3 Final Conclusion

ManageR successfully addresses the defined problem of fragmented collaboration workflows by unifying operational and communication features in a secure and scalable web platform. The implementation demonstrates that a carefully structured architecture and domain-oriented module design can satisfy both academic objectives and practical software utility.

## 6.4 Project Outcomes Mapped to Objectives

1. **Secure Authentication:** completed through JWT-protected flows and profile endpoints.
2. **Project Lifecycle Coverage:** achieved via complete project APIs and invitation logic.
3. **Issue Lifecycle Governance:** implemented through assignment and state update operations.
4. **Communication Continuity:** supported through comments and project chat interfaces.
5. **Subscription Enablement:** operational through upgrade and payment-link workflow.

## 6.5 Lessons Learned

Major lessons from engineering and execution include:

1. Domain modeling quality strongly influences implementation clarity.
2. Early definition of API contracts reduces integration friction.
3. Security should be integrated from the first iteration, not post-development.
4. Feature-wise modularization improves parallel team productivity.

## 6.6 Closing Remark

The project establishes a strong baseline for a production-viable collaborative platform and provides a meaningful demonstration of full-stack software engineering competence expected at final-year B.Tech level.

## 6.7 Project Limitations and Reflection

Although objectives were met, a few practical limitations remain:

1. Realtime messaging is partially implemented and can be further matured on frontend integration.
2. Large-scale pagination and caching strategies are pending full implementation.
3. Broad automated regression coverage can be expanded with dedicated test suites.

These limitations do not invalidate current outcomes but identify clear next engineering priorities.

## 6.8 Academic and Industrial Relevance

From an academic perspective, the project demonstrates end-to-end understanding of full-stack architecture, secure API design, and modular implementation. From an industrial perspective, it provides a practical baseline for a SaaS-like collaboration product with extensible roadmap potential.

## 6.9 Concluding Statement

ManageR validates that a disciplined, layered, and requirement-driven development approach can transform a problem statement into a deployable software system that is both functionally useful and architecturally extensible.

---

# Chapter 7: Future Scope

Potential enhancements include:

1. Complete WebSocket-based realtime chat integration in frontend with presence indicators.
2. Backend pagination and advanced query optimization for large datasets.
3. Enhanced RBAC with fine-grained role permissions and audit trails.
4. Notification subsystem (email and in-app) for assignments and status changes.
5. Dashboard analytics for productivity insights and project health metrics.
6. File attachments for issues/comments with secure object storage.
7. CI/CD pipelines and containerized deployment for production readiness.
8. AI-assisted issue summarization and prioritization support.

## 7.1 Future Scope with Technical Direction

### 7.1.1 Realtime Collaboration Expansion

Introduce full duplex WebSocket communication for:

1. Live issue activity feed.
2. Typing indicators and online member presence.
3. Real-time notification of assignment and status transitions.

### 7.1.2 Advanced Authorization Model

Move from basic role checks to policy-driven access control with resource-level permissions:

1. Owner, Maintainer, Contributor, Viewer roles.
2. Action-level permissions for issue transitions and deletion rules.
3. Auditable policy change history.

### 7.1.3 Scalability-Oriented Data Strategy

1. Cursor-based pagination for large project and issue lists.
2. Read-optimized indexing and caching for dashboard workloads.
3. Archival strategy for inactive projects and historical logs.

### 7.1.4 Quality Engineering Improvements

1. Expand automated backend integration testing suites.
2. Add frontend component and user-flow testing with CI gates.
3. Introduce static analysis and security scan workflows.

### 7.1.5 Product Maturity Enhancements

1. Team-level analytics and progress forecasting.
2. Calendar and reminder integrations.
3. Export and reporting module for academic submissions and audits.

## 7.2 Phase-Wise Future Roadmap

### 7.2.1 Short-Term Roadmap (0-3 Months)

1. Implement server-side pagination and sorting for projects/issues.
2. Add robust form-level validation feedback and standardized error envelopes.
3. Increase integration test depth for invitation and subscription flows.

### 7.2.2 Mid-Term Roadmap (3-6 Months)

1. Introduce full realtime chat/event feeds via WebSocket and STOMP subscriptions.
2. Implement role hierarchy with policy-driven authorization checks.
3. Add notification center for assignment updates and due-date reminders.

### 7.2.3 Long-Term Roadmap (6-12 Months)

1. Multi-tenant workspace model for organizational usage.
2. Advanced analytics dashboard with sprint and throughput insights.
3. Enterprise-grade observability and compliance-oriented audit reporting.

## 7.3 Research and Innovation Opportunities

The platform can serve as a foundation for advanced academic extensions:

1. ML-assisted issue triaging and priority recommendation.
2. Natural-language summarization of project communication threads.
3. Predictive project risk scoring using historical issue progression patterns.

These opportunities can convert ManageR from a management tool into an intelligent collaborative decision-support system.

---

# Appendix

## Appendix A: Core API Endpoints

### Authentication

- POST /auth/signup
- POST /auth/signin

### User

- GET /api/users/profile
- GET /api/users/{userId}

### Projects

- GET /api/projects
- GET /api/projects/{projectId}
- POST /api/projects
- PUT /api/projects/{projectId}
- DELETE /api/projects/{projectId}
- GET /api/projects/search
- POST /api/projects/invite
- GET /api/projects/accept_invitation
- GET /api/projects/{projectId}/chat

### Issues

- GET /api/issues/{issueId}
- GET /api/issues/project/{projectId}
- POST /api/issues
- PUT /api/issues/{issueId}
- DELETE /api/issues/{issueId}
- GET /api/issues/search
- PUT /api/issues/{issueId}/assignee/{userId}
- PUT /api/issues/{issueId}/status/{status}

### Comments

- POST /api/comments
- GET /api/comments/{issueId}
- DELETE /api/comments/{commentId}

### Messages

- POST /api/messages/send
- GET /api/messages/chat/{projectId}
- WebSocket: /app/chat/{groupId}

### Subscription and Payment

- GET /api/subscriptions/user
- PATCH /api/subscriptions/upgrade
- POST /api/payments/{planType}

### Password Reset

- POST /reset-password/reset
- POST /reset-password

## Appendix B: Data Model Summary

- User owns and joins projects.
- Project contains team members, issues, and a chat context.
- Issue belongs to project, includes assignee and comments.
- Comment belongs to issue and user.
- Chat belongs to project and includes messages.
- Subscription belongs to user and tracks plan state.
- Invitation and PasswordResetToken support secure tokenized flows.

## Appendix C: Sample API Payloads

### C.1 Signup Request

```json
{
	"fullName": "Sample User",
	"email": "sample.user@example.com",
	"password": "StrongPassword@123"
}
```

### C.2 Signup/Signin Response

```json
{
	"token": "<jwt-token>",
	"message": "Authentication successful"
}
```

### C.3 Create Project Request

```json
{
	"name": "Major Project",
	"description": "Collaboration platform implementation",
	"category": "Software",
	"tags": ["spring", "react", "management"]
}
```

### C.4 Create Issue Request

```json
{
	"projectId": 101,
	"title": "Implement issue status endpoint",
	"description": "Support state transition APIs",
	"priority": "HIGH",
	"status": "todo",
	"dueDate": "2026-05-10"
}
```

## Appendix D: Sample SQL-Oriented Schema View

```sql
TABLE users (
	id BIGINT PRIMARY KEY,
	full_name VARCHAR(150),
	email VARCHAR(150) UNIQUE,
	password_hash VARCHAR(255),
	created_at TIMESTAMP
);

TABLE projects (
	id BIGINT PRIMARY KEY,
	owner_id BIGINT,
	name VARCHAR(200),
	description TEXT,
	category VARCHAR(100),
	created_at TIMESTAMP,
	FOREIGN KEY (owner_id) REFERENCES users(id)
);

TABLE issues (
	id BIGINT PRIMARY KEY,
	project_id BIGINT,
	assignee_id BIGINT,
	title VARCHAR(250),
	description TEXT,
	status VARCHAR(30),
	priority VARCHAR(30),
	due_date DATE,
	created_at TIMESTAMP,
	FOREIGN KEY (project_id) REFERENCES projects(id),
	FOREIGN KEY (assignee_id) REFERENCES users(id)
);
```

## Appendix E: Risk Register (Condensed)

| Risk | Impact | Probability | Mitigation |
| --- | --- | --- | --- |
| Hardcoded secret exposure | High | Medium | Move secrets to environment vault/config |
| Unauthorized project access | High | Low-Medium | Enforce role checks in service layer |
| Performance degradation at scale | Medium | Medium | Add pagination, caching, and query tuning |
| Payment callback failures | Medium | Low | Retry mechanism and callback validation |
| Incomplete test automation | Medium | Medium | Expand CI-based unit/integration suites |

---

# Bibliography

1. Pressman, R. S., and Maxim, B. R. _Software Engineering: A Practitioner's Approach_. McGraw-Hill.
2. Sommerville, I. _Software Engineering_. Pearson.
3. Fielding, R. T. "Architectural Styles and the Design of Network-based Software Architectures" (REST dissertation).
4. Oracle. "Java and Spring Ecosystem Documentation."
5. React Documentation, Redux Toolkit Documentation, and Vite Documentation.
6. MySQL Reference Manual.
7. OWASP Foundation. "Web Application Security Testing and Best Practices."
8. Razorpay Developer Documentation.
9. IEEE Standards Association. "IEEE Guide for Software Requirements Specifications."
10. Gamma, E., Helm, R., Johnson, R., and Vlissides, J. _Design Patterns: Elements of Reusable Object-Oriented Software_.
11. Fowler, M. _Patterns of Enterprise Application Architecture_.
12. Newman, S. _Building Microservices_ (for service decomposition references and scalability strategies).
13. NIST. "Digital Identity Guidelines" (authentication and identity lifecycle best practices).
14. RFC 7519. "JSON Web Token (JWT)".

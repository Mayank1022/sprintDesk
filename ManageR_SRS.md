# ManageR - Simple Software Requirements Specification (SRS)

## 1. Project Overview

ManageR is a web application for managing projects, tasks (issues), team collaboration, chat, and subscription plans.

It has two parts:

- Frontend: React + Redux (Vite)
- Backend: Spring Boot + MySQL

## 2. Main Goals

- Allow users to sign up and log in securely.
- Allow users to create and manage projects.
- Allow teams to manage issues inside projects.
- Allow project communication through chat.
- Support paid subscription upgrades.

## 3. Users

- Guest user:
  - Can sign up and sign in.
  - Can request password reset.
- Logged-in user:
  - Can create/manage projects.
  - Can create/update issues and comments.
  - Can use project chat.
  - Can upgrade subscription.
- Admin (future/limited):
  - Reserved by role-based security path.

## 4. Functional Requirements

### 4.1 Authentication

- User can register with name, email, and password.
- User can log in with email and password.
- System returns JWT token after successful login/signup.
- Logged-in user can fetch profile.
- User can log out (frontend clears token/session data).

### 4.2 Password Reset

- User can request reset link by email.
- System creates reset token.
- User can reset password with valid token.
- Expired/used token is removed.

### 4.3 Project Management

- User can create project with:
  - Name, description, category, tags.
- User can view project list.
- User can filter projects by category and tag.
- User can search projects by keyword.
- User can update and delete projects.
- Owner can invite users by email.
- Invited user can accept invitation via token link.

### 4.4 Issue Management

- User can create issue in a project.
- Issue supports title, description, status, priority, due date.
- User can view issue details and list issues by project.
- User can update issue fields.
- User can assign issue to a user.
- User can update issue status (todo/in_progress/done).
- User can delete issue.

### 4.5 Comments

- User can add comment to issue.
- User can list comments for issue.
- User can delete own comment (as per service rules).

### 4.6 Chat

- Each project has a chat context.
- User can send messages in project chat.
- User can load chat history.
- Backend supports WebSocket/STOMP route (frontend is mostly REST-based currently).

### 4.7 Subscription and Payment

- New users start with Free plan.
- User can view current subscription.
- User can upgrade to Monthly or Annual.
- System generates payment link (Razorpay).
- Frontend redirects user to payment link.
- After payment callback, subscription is upgraded.

## 5. Core API Summary

### Auth

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

### Chat Messages

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

## 6. Data Model (Simple)

- User -> can own/join projects
- Project -> has team, issues, and one chat
- Issue -> belongs to project, has assignee and comments
- Comment -> belongs to issue and user
- Chat -> belongs to project, has many messages
- Message -> belongs to chat and sender
- Subscription -> belongs to user
- Invitation -> token + email + projectId
- PasswordResetToken -> token + user + expiry

## 7. Non-Functional Requirements

- Security:
  - JWT auth for protected APIs
  - Password hashing using bcrypt
- Performance:
  - Project/issue/chat pages should load with normal user-facing speed
- Usability:
  - Form validation on auth/project/issue forms
- Reliability:
  - APIs should return clear success/error responses
- Maintainability:
  - Code should stay modular by feature (auth/project/issue/chat/subscription)
- Testability:
  - Add backend unit/integration tests and frontend component tests

## 8. Business Rules

- Free plan allows up to 3 projects (frontend rule currently).
- Monthly plan uses base monthly pricing.
- Annual plan applies discount logic.
- Signup automatically creates free subscription.

## 9. Current Limitations

- Some secrets are hardcoded and should be moved to environment variables.
- WebSocket support exists but frontend uses REST for most chat actions.
- Some authorization checks need stricter enforcement in sensitive endpoints.
- Backend pagination is not implemented yet.

## 10. Acceptance Criteria (Simple)

- User can register/login and access protected pages.
- User can create/update/delete/search/filter projects.
- User can invite member and accept invitation.
- User can create/update/assign/delete issues and comments.
- User can send and view chat messages.
- User can upgrade plan through payment link flow.

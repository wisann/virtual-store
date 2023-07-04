# Backend Project

This is the backend project of the virtual-store application. It provides an API for managing people, products, product images, states, and email services.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA

## Setup

Make sure you have Java installed on your machine. Additionally, you will need a Java development environment such as Eclipse or IntelliJ IDEA to run the project.

## Execution Instructions

1. Clone the project repository.
2. Open the Java development environment and import the project.
3. Run the project to start the backend server.

## Available Services

### PersonManagementService

This service handles password recovery for users.

- `solicitarCodigo(email: String)`: Sends a password recovery code to the provided email.

### PersonService

This service handles person management.

- `buscarTodos()`: Returns a list of all people.
- `inserir(person: Person)`: Inserts a new person.
- `alterar(person: Person)`: Modifies data for an existing person.
- `excluir(id: Long)`: Deletes a person based on the provided ID.

### ProductImagesService

This service handles product image management.

- `buscarTodos()`: Returns a list of all product images.
- `inserir(idProduto: Long, file: MultipartFile)`: Inserts a new product image for the product with the provided ID.
- `alterar(productImages: ProductImages)`: Modifies data for an existing product image.
- `excluir(id: Long)`: Deletes a product image based on the provided ID.

### ProductService

This service handles product management.

- `buscarTodos()`: Returns a list of all products.
- `inserir(product: Product)`: Inserts a new product.
- `alterar(product: Product)`: Modifies data for an existing product.
- `excluir(id: Long)`: Deletes a product based on the provided ID.

### StateService

This service handles state management.

- `buscarTodos()`: Returns a list of all states.
- `inserir(state: State)`: Inserts a new state.
- `alterar(state: State)`: Modifies data for an existing state.
- `excluir(id: Long)`: Deletes a state based on the provided ID.

### BrandService

This service handles brand management.

- `buscarTodos()`: Returns a list of all brands.
- `inserir(brand: Brand)`: Inserts a new brand.
- `alterar(brand: Brand)`: Modifies data for an existing brand.
- `excluir(id: Long)`: Deletes a brand based on the provided ID.

### CategoryService

This service handles category management.

- `buscarTodos()`: Returns a list of all categories.
- `inserir(category: Category)`: Inserts a new category.
- `alterar(category: Category)`: Modifies data for an existing category.
- `excluir(id: Long)`: Deletes a category based on the provided ID.

### CityService

This service handles city management.

- `buscarTodos()`: Returns a list of all cities.
- `inserir(city: City)`: Inserts a new city.
- `alterar(city: City)`: Modifies data for an existing city.
- `excluir(id: Long)`: Deletes a city based on the provided ID.

### ClientPersonService

This service handles client person management.

- `buscarTodos()`: Returns a list of all client persons.
- `inserir(person: Person)`: Inserts a new client person.
- `alterar(person: Person)`: Modifies data for an existing client person.
- `excluir(id: Long)`: Deletes a client person based on the provided ID.

### PermissionService

This service handles permission management.

- `buscarTodos()`: Returns a list of all permissions.
- `buscarPorNome(nome: String)`: Returns a list of permissions with the provided name.
- `inserir(permission: Permission)`: Inserts a new permission.
- `alterar(permission: Permission)`: Modifies data for an existing permission.
- `excluir(id: Long)`: Deletes a permission based on the provided ID.

### PersonPermissionService

This service handles person permission management.

- `buscarTodos()`: Returns a list of all person permissions.
- `inserir(personPermission: PersonPermission)`: Inserts a new person permission.
- `alterar(personPermission: PersonPermission)`: Modifies data for an existing person permission.
- `excluir(id: Long)`: Deletes a person permission based on the provided ID.

### EmailService

This service handles email functionality.

- `sendEmail(recipient: String, title: String, message: String)`: Sends an email with the provided recipient, title, and message.

## Contributing

Feel free to contribute to this project by opening issues and pull requests.


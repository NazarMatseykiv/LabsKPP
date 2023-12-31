package org.o7planning.sbsocial.entity;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
 
@Entity
@Table(name = "App_Role", //
    uniqueConstraints = { //
        @UniqueConstraint(name = "APP_ROLE_UK", columnNames = "Role_Name") })
public class AppRole {
   
  public static final String ROLE_USER = "ROLE_USER";
  public static final String ROLE_ADMIN = "ROLE_ADMIN";
  
  @Id
  @GeneratedValue
  @Column(name = "Role_Id", nullable = false)
  private Long roleId;
 
  @Column(name = "Role_Name", length = 30, nullable = false)
  private String roleName;
 
  public Long getRoleId() {
    return roleId;
  }
 
  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }
 
  public String getRoleName() {
    return roleName;
  }
  
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }
  
}

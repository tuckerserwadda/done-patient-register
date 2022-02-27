<template>
    <div>
  
<div v-if="patientRegister">

    
        <!-- <div class="patient-data-table"> -->
            <DataTable ref="dt" :value="patientRegister" responsiveLayout="stack">
                <template #header><h3>{{patientRegister != null? "Rigistered Patients" :"No Patients Registered" }}</h3></template>
                  <Column  header="Driver License">
                  <template #body="slotProps">
                      <img :src="slotProps.data.driverLicense" height="30" width="40" alt="Driver Lisence"/>
                  </template>
                  </Column>
                  <Column field="firstName" header="First Name" ></Column>
                  <Column field="lastName" header="Last Name" ></Column>
                  <Column field="phoneNumber" header="Phone  Number" ></Column>
                  <Column field="email" header="email" ></Column>
                  <Column field="address" header="address" ></Column>
                  <Column field="dateOfBirth" header="Date Of Birth" ></Column>
                  <Column field="timeOfAppointment" header="Appointment Time" ></Column>
            </DataTable>

        <!-- </div> -->
  

  </div>
        

    </div>
</template>

<script>
    export default {
        name:'ViewPatientRegister',

        created() {
            this.$store.dispatch('getPatients')
            .catch((error)=>{
                console.log(error)
            })
        },
        computed:{
            patientRegister(){
                return this.$store.state.patientRegister
            },
            patientRegisterKeys(){
                return Object.keys(this.$store.state.patientRegister)
            }
        },
        methods: {
            showRegister(){
                console.log(this.patientRegister)
            }
        },
        
    }
</script>

<style  scoped>

</style>